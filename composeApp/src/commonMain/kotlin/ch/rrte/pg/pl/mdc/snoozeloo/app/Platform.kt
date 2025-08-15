package ch.rrte.pg.pl.mdc.snoozeloo.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform