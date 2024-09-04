plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.projetohnv"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.projetohnv"
        minSdk = 34
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
        viewBinding = true
    }
}

dependencies {
    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.10.0")
    implementation ("com.squareup.retrofit2:converter-simplexml:2.10.0")
    implementation("com.squareup.retrofit2:converter-gson:2.10.0")
    implementation("com.squareup.picasso:picasso:2.8")

    // biblioteca simple xml framework
    implementation("org.simpleframework:simple-xml:2.7.1")

    // biblioteca TikXml
 /*   implementation("com.tickaroo.tikxml:annotation:0.8.15")
    implementation("com.tickaroo.tikxml:core:0.8.15")
    implementation("com.tickaroo.tikxml:processor:0.8.15")
    implementation("com.tickaroo.tikxml:retrofit-converter:0.8.15")
    implementation("com.tickaroo.tikxml:auto-value-tikxml:0.8.15")*/

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}