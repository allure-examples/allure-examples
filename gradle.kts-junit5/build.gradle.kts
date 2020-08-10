import io.qameta.allure.gradle.AllureExtension

plugins {
    java
    maven
    id("io.qameta.allure") version "2.8.1"
}

group "io.qameta.allure.examples"
version 1.0

val allureVersion = "2.13.5"
val junit5Version = "5.6.2"

tasks.withType(JavaCompile::class) {
    sourceCompatibility = "${JavaVersion.VERSION_1_8}"
    targetCompatibility = "${JavaVersion.VERSION_1_8}"
    options.encoding = "UTF-8"
}

//tasks.withType(JavaTestCompile::class) {
//    sourceCompatibility = "${JavaVersion.VERSION_1_8}"
//    targetCompatibility = "${JavaVersion.VERSION_1_8}"
//    options.encoding = "UTF-8"
//}

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
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compile("commons-io:commons-io:2.6")

    compile("io.qameta.allure:allure-java-commons:$allureVersion")
    compile("org.junit.jupiter:junit-jupiter-api:$junit5Version")
    compile("org.junit.jupiter:junit-jupiter-engine:$junit5Version")
    compile("org.junit.jupiter:junit-jupiter-params:$junit5Version")
}
