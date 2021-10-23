plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.0.0-alpha2"
}

version = "1.0"

repositories {
    mavenCentral()
    maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(compose.web.widgets)
                implementation(compose.web.core)
                implementation(compose.runtime)
                implementation(npm("copy-webpack-plugin", "9.0.0"))
                implementation(npm("@material-ui/icons", "4.11.2"))
                implementation(project(":shared"))
            }
        }
    }
}

// https://github.com/JetBrains/compose-jb/issues/1259
afterEvaluate {
    rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
        versions.webpackCli.version = "4.9.0"
        versions.webpackDevServer.version = "4.0.0"
    }
}

compose.desktop {
    application {
        mainClass = ""
    }
}