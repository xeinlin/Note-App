plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-parcelize")
    id ("androidx.navigation.safeargs")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.heinlin.thenotesapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.heinlin.thenotesapp"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures{
        //noinspection DataBindingWithoutKapt
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1100)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)

    // ROOM
    val roomVersion = "2.6.1"
    implementation (libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android.v171)
    implementation (libs.androidx.room.ktx)
    
    // Navigation
    val navVersion = "2.7.5"
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // Life Cycle Arch
    val lifecycleVersion = "2.6.2"

    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)

    // Annotation processor
    ksp(libs.androidx.lifecycle.compiler)
}