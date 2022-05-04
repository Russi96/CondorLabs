plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = Configs.compileSdk

    defaultConfig {
        minSdk = Configs.minSdk
        targetSdk = Configs.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {

    implementation (project(":domain"))
    // Dagger -Hilt
    implementation("com.google.dagger:dagger:2.41")
    kapt("com.google.dagger:dagger-compiler:2.41")
    implementation("com.google.dagger:hilt-android:2.41")
    kapt("com.google.dagger:hilt-compiler:2.41")

    implementation ("com.google.dagger:hilt-android:2.41")
    kapt ("com.google.dagger:hilt-compiler:2.41")
}