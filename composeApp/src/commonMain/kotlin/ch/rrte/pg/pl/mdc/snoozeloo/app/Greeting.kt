package ch.rrte.pg.pl.mdc.snoozeloo.app

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}