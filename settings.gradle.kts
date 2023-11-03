pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://jitpack.io") // Kotlin 스크립트 문법으로 수정
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io") // Kotlin 스크립트 문법으로 수정
    }
}

rootProject.name = "swap"
include(":app")
