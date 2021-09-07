plugins {
    kotlin("jvm")
    id("org.jetbrains.compose") version "1.0.0-alpha2"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(project(":shared"))
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}