plugins {
    java
    kotlin("jvm") version ProjectSetting.KOTLIN_VERSION
    `maven-publish`
}

repositories {
    google()
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

group = ProjectSetting.LIBRARY_GROUP_ID
version = ProjectSetting.PROJECT_VERSION_NAME

publishing {

    publications {
        register("gprRelease", MavenPublication::class) {
            from(components["java"])
            artifactId = rootProject.name
            groupId = project.group.toString()
            version = project.version.toString()
        }

        repositories {
            maven { url = uri("https://jitpack.io") }
        }

    }
}