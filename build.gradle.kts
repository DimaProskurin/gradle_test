/*
 * This file was generated by the Gradle "init" task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.21"))
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.21"
}

group = "com.github"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("io.netty:netty-all:4.1.33.Final")
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.0")
}