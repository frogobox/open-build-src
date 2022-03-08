## open-build-src
[![](https://jitpack.io/v/frogobox/open-build-src.svg?style=flat-square)](https://jitpack.io/#frogobox/open-build-src)

- Library for contant data buildSrc
- Library for calling contant variable for build.gradle.kts
- Develop using IntelliJ IDEA
- License [Click Here](https://raw.githubusercontent.com/frogobox/open-build-src/master/LICENSE)
- Privacy Policy [Click Here](https://raw.githubusercontent.com/frogobox/open-build-src/master/PRIVACY-POLICY.md)

Repository for testing build from jitpack.io
- Red : Failed
- Green : Success / Pass

## Version Release
This Is Latest Release

    $version_release = 1.0.0

What's New??

    * Available for buildSrc Kotlin DSL *

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle.kts : BuildSrc)

```kotlin
repositories {
    ...
    maven { url = uri("https://jitpack.io") }
}
```

### Step 2. Add the dependency (build.gradle.kts : BuildSrc)

```kotlin
dependencies {
    // library open-build-src
    implementation("com.github.frogobox:open-build-src:1.0.0")
}
```

### Step 3. Usage (Add on your dependencies build.gradle.kts : app)

#### Androidx Library

```kotlin
implementation(Androidx.appCompat)
implementation(Androidx.appCompatResources)
implementation(Androidx.activityKtx)
implementation(Androidx.fragmentKtx)
implementation(Androidx.constraintLayout)
implementation(Androidx.collection)
implementation(Androidx.savedState)
implementation(Androidx.viewPager2)
implementation(Androidx.preferenceKtx)
implementation(Androidx.navigationRuntimeKtx)
implementation(Androidx.navigationFragmentKtx)
implementation(Androidx.navigationUiKtx)
```

#### Google Library

```kotlin
implementation(Google.animations)
implementation(Google.material)
implementation(Google.gson)
implementation(Google.admob)
implementation(Google.userMessagingPlatform)
```

#### JetBrains Library

```kotlin
implementation(JetBrains.coroutinesCore)
implementation(JetBrains.coroutinesAndroid)
```

#### Koin Library
```kotlin
implementation(Koin.core)
implementation(Koin.android)
implementation(Koin.androidCompat)
implementation(Koin.androidxWorkManager)
implementation(Koin.androidxCompose)
implementation(Koin.ktor)

testImplementation(Koin.test)
```

#### Square Library
```kotlin
implementation(Square.Retrofit2.retrofit)
implementation(Square.Retrofit2.converterGson)
implementation(Square.Retrofit2.converterJackson)
implementation(Square.Retrofit2.converterMoshi)
implementation(Square.Retrofit2.converterProtobuf)
implementation(Square.Retrofit2.converterWire)
implementation(Square.Retrofit2.converterSimpleXml)
implementation(Square.Retrofit2.converterJAXB)
implementation(Square.Retrofit2.Scalars)
implementation(Square.Retrofit2.adapterRxJava)
implementation(Square.Retrofit2.adapterRxJava2)
implementation(Square.Retrofit2.adapterRxJava3)
```

#### ReactiveX Library
```kotlin
// Deprecated
implementation(Reactivex.rxJava2)
implementation(Reactivex.rxAndroid2)

// Latest Version
implementation(Reactivex.rxJava3)
implementation(Reactivex.rxAndroid3)
implementation(Reactivex.rxKotlin3)
```

#### Util Library
```kotlin
implementation(Util.glide)
implementation(Util.coil)

kapt(Util.glideCompiler)
```

### Screenshoot (Step 2. Add the dependency (build.gradle.kts : BuildSrc)
![](docs/image/ss_step_2.png?raw=true)

### Screenshoot (Step 3. Usage (Add on your dependencies build.gradle.kts : app))
![](docs/image/ss_step_3.png?raw=true)

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account
