# RRTech Examples - Snoozeloo

## Overview
Sonoozeloo is the first of the app challenges to be built from Philipp Lackner's [Mobile Dev Campus](https://pl-coding.com/campus).

## Setup
Create a new project folder initialize git and create a remote repository on the git platform of your joice.

We start with a new Kotlin Multiplatform project template from the wizzard. Go to [kmp.jetbrains.com](https://kmp.jetbrains.com/) and create an new project for Android, iOs, Desktop and Web. Open the project in you IDE.

### Monorepo Folder structure
This is the monorepo for the GTrading app.
Following folder structure is used:

|----> apps
|   |----> composeApp
|   |----> iosApp
|   |----> etc.
|   |----> modules
|----> docs
|----> domains
|   |----> auth
|   |----> core
|   |----> order
|       |----> order-api-spec
|       |----> order-app-modules
|       |----> order-service
|       |----> etc.
|   |----> payment
|   |----> recommendations
|       |----> recommendations-agent
|   |----> user
|   |----> etc.
|----> infra
|   |----> dlt
|       |----> ledger-access
|----> platform
|   |----> api-gateway
|   |----> observability
|----> shared


### Apps

#### Move apps to the apps folder

As you need Xcode, you can only do this on a Mac.

1. Disable the Kotlin Multiplatform plugin
2. Create the apps folder
3. Comment out the composeApp
4. Move the composeApp folder into apps/composeApp
5. Enable the composeApp again in settings.gradle.kts -> include(":apps:composeApp")
6. Try to run the app and fix the compile errors
7. In the iosApp in isoApp.xcodeproj, delete the generated folders, iosApp.xcodeproj/xuserdata and iosApp.xcodeproj/project.xcworkspace/xuserdata
8. Move the iosApp folder into apps/iosApp
9. Open the iosApp with Xcode -> apps/iosApp/iosApp.xcodeproj and run it, it should fail
10. Click on the top iosApp in the left sidebar, -> Build Phases -> Compile Kotlin Framework and change the script to point to where the composeApp is like ./gradlew :apps:composeApp:embedAndSignAppleFrameworkForXcode
11. Now the app should build and run in Xcode
12. Back in IntelliJ enable the iosApp in settings.gradle.kts as well -> include(":apps:iosApp")
13. Enable the Kotlin Multiplatform plugin again
14. Clean the Run Configurations
15. Now you should be able to run all apps from IntelliJ

If you also have a shared folder, move it into the apps folder as well. There could be dependencies from the iosApp