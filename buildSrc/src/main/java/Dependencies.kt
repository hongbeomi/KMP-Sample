object Versions {
    const val kotlin = "1.5.21"
    const val koin = "3.1.2"
}


object AndroidSdk {
    const val min = 21
    const val compile = 30
    const val target = compile
}

object Koin {
    const val core = "io.insert-koin:koin-core:${Versions.koin}"
    const val android = "io.insert-koin:koin-android:${Versions.koin}"
}
