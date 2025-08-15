package ch.rrte.pg.pl.mdc.snoozeloo.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Snoozeloo",
    ) {
        App()
    }
}