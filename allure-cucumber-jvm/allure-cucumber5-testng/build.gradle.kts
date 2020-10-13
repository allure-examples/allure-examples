import io.qameta.allure.gradle.AllureExtension

plugins {
    java
    maven
    id("io.qameta.allure") version "2.8.1"
}

group "io.qameta.allure.examples"
version 1.3

val allureVersion = "2.13.6"
val testngVersion = "6.14.3"
val cucumberVersion = "5.7.0"

tasks.withType(JavaCompile::class) {
    sourceCompatibility = "${JavaVersion.VERSION_1_8}"
    targetCompatibility = "${JavaVersion.VERSION_1_8}"
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    compileTestJava {
        options.encoding = "UTF-8"
    }
}

configure<AllureExtension> {
    autoconfigure = false
    aspectjweaver = true
    version = allureVersion

    clean = true
}

tasks.withType(Test::class) {
    ignoreFailures = true
    useTestNG {

    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation("io.qameta.allure:allure-cucumber5-jvm:$allureVersion")

    testImplementation("io.cucumber:cucumber-testng:$cucumberVersion")
    testImplementation("io.cucumber:cucumber-java:$cucumberVersion")

    testImplementation("org.testng:testng:$testngVersion")
    testImplementation("org.slf4j:slf4j-simple:1.7.30")
}
