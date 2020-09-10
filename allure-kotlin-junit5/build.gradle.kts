import io.qameta.allure.gradle.AllureExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    //java
    maven
    kotlin("jvm") version "1.3.70"
    id("io.qameta.allure") version "2.8.1"
}

group "io.qameta.allure.examples"
version 1.1

val allureVersion = "2.13.5"
val junit5Version = "5.6.2"

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

configure<AllureExtension> {
    autoconfigure = true
    aspectjweaver = true
    version = allureVersion

    clean = true

    useJUnit5 {
        version = allureVersion
    }
}

tasks.withType(Test::class) {
    ignoreFailures = true
    useJUnitPlatform {

    }

    systemProperty("junit.jupiter.execution.parallel.enabled", "true")
    systemProperty("junit.jupiter.execution.parallel.config.strategy", "dynamic")
    systemProperty("junit.jupiter.extensions.autodetection.enabled", "true")

//    testLogging {
//        events("passed", "skipped", "failed")
//    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation("io.qameta.allure:allure-java-commons:$allureVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit5Version")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junit5Version")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junit5Version")

    testImplementation(kotlin("stdlib-jdk8"))

    testImplementation("org.slf4j:slf4j-simple:1.7.30")
}