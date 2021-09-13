plugins {
    kotlin("multiplatform")
    id("com.android.library")
//    id("org.jetbrains.compose") version Versions.compose
}

kotlin {
    android()
    jvm("desktop")
    js("web")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(Compose.foundation)
                implementation(Compose.foundationLayout)
                implementation(Compose.material)
                implementation(Compose.ui)
                implementation(Compose.uiTooling)
                implementation(Compose.uiGraphics)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.activity:activity-compose:1.3.0")
            }
        }
        val desktopMain by getting
        val webMain by getting
    }
}

android {
    compileSdk = AndroidSdk.compile
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
    }
}