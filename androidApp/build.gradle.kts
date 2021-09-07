plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
//    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = AndroidSdk.compile
    defaultConfig {
        applicationId = "github.hongbeomi.kmm_premierleague.android"
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")

    implementation(Compose.ui)
    implementation(Compose.uiGraphics)
    implementation(Compose.uiTooling)
    implementation(Compose.foundation)
    implementation(Compose.foundationLayout)
    implementation(Compose.material)
    implementation(Compose.coilCompose)

    kapt(Hilt.hiltCompiler)
    implementation(Hilt.hilt)

    implementation(project(":shared"))
}

kapt {
    correctErrorTypes = true
}
