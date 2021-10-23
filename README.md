# KMP-Sample
Kotlin Multiplatform Sample 

- Android
- iOS 
- Web (Compose for web)
- Desktop (Compose for desktop)

<br/>

## 🛠 Build

- At least android Arctic Fox version should be used and at least Java 11 should be used
- To run a web client, you can enter `./gradlew :webApp:jsBrowserDevelopmentRun`
- To start a desktop client, enter `./gradlew :desktop:run`

<br/>

## 🚀 ScreenShot

![image](https://github.com/hongbeomi/KMP-Sample/blob/master/image.png)

<br/>

## ✨ Stack

- [Kotlin](https://kotlinlang.org/)
- [Android Architecture Component](https://developer.android.com/topic/libraries/architecture/index.html)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Koin](https://github.com/InsertKoinIO/koin)

<br/>

## ⚠️ Warning

```groovy
// webApp/build.gradle.kts - webpack An issue arises.
// https://github.com/JetBrains/compose-jb/issues/1259
afterEvaluate {
    rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
        versions.webpackCli.version = "4.9.0"
        versions.webpackDevServer.version = "4.0.0"
    }
}
```



<br/>

## 👀 Reference

- https://github.com/joreilly/PeopleInSpace
- https://kotlinlang.org/docs/mobile/home.html
- https://github.com/JetBrains/compose-jb