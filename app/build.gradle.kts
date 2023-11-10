@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt.android)
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-kapt")
}

android {
    namespace = "ru.vdh.myapp"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "ru.vdh.myapp"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = libs.versions.jvmTarget.get()
    }
    buildFeatures {
        viewBinding = true
    }
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}

dependencies {
    implementation(project(":core:ui"))
    implementation(project(":core:presentation"))
    implementation(project(":core:domain"))
    implementation(project(":common"))

    implementation(project(":feature:newfeature:ui"))
    implementation(project(":feature:newfeature:presentation"))
    implementation(project(":feature:newfeature:domain"))
    implementation(project(":feature:newfeature:data"))
    implementation(project(":feature:newfeature:datasource"))

    implementation(project(":feature:secondfeature:ui"))
    implementation(project(":feature:secondfeature:presentation"))
    implementation(project(":feature:secondfeature:domain"))
    implementation(project(":feature:secondfeature:data"))
    implementation(project(":feature:secondfeature:datasource"))

    implementation(libs.bundles.android.core)
    implementation(libs.bundles.fragment)
    implementation(libs.kotlinx.coroutines.android)

    //Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(libs.junit)
    androidTestImplementation(libs.test.junit)
    androidTestImplementation(libs.test.espresso)

}
