object Versions {
    const val kotlin = "1.5.21"
    const val kotlinCoroutines = "1.5.1-native-mt"
    const val kotlinxSerialization = "1.2.2"

    const val compose = "1.0.2"
    const val nav_compose = "2.4.0-alpha08"
    const val coilCompose = "1.3.1"

    const val retrofit = "2.6.0"
    const val okhttp = "4.9.0"

    const val hilt = "2.38.1"

    const val junit = "4.13"
}


object AndroidSdk {
    const val min = 21
    const val compile = 30
    const val target = compile
}

object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coilCompose}"
}

object Network {
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okhttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okhttp}"
    const val okhttp  = "com.squareup.okhttp3:okhttp"
    const val okhttpUrlConnection = "com.squareup.okhttp3:okhttp-urlconnection"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
}

object Hilt {
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
}


object Serialization {
    const val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"
}
