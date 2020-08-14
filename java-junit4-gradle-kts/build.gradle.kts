import io.qameta.allure.gradle.AllureExtension

plugins {
    java
    maven
    id("io.qameta.allure") version "2.8.1"
}

group "io.qameta.allure.examples"
version 1.1

val allureVersion = "2.13.5"
val junit4Version = "4.12"

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

    useJUnit4 {
        version = allureVersion
    }
}

tasks.withType(Test::class) {
    ignoreFailures = true
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation("io.qameta.allure:allure-java-commons:$allureVersion")

    testImplementation("junit:junit:$junit4Version")
    testImplementation("org.slf4j:slf4j-simple:1.7.30")
}
