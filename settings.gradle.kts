pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "KMP-Sample"

include(
    ":androidApp",
    ":desktopApp",
    ":webApp",
    ":shared",
)