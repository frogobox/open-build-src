import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version ProjectSetting.KOTLIN_VERSION
    `maven-publish`
}

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

group = ProjectSetting.LIBRARY_GROUP_ID
version = ProjectSetting.PROJECT_VERSION_NAME

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
}

publishing {

    publications {
        register("release", MavenPublication::class) {
            from(components["java"])
            artifactId = rootProject.name
            groupId = project.group.toString()
            version = project.version.toString()
        }

        repositories {
            maven("https://jitpack.io")
        }

    }
}