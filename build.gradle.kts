// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.library") version "7.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
    id ("com.android.application") version Version.gradleVersion apply false
    id("androidx.navigation.safeargs.kotlin") version Version.navigation apply false
}

buildscript {

    dependencies {

        classpath ("com.google.dagger:hilt-android-gradle-plugin:${Version.dagger}")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}