val logback_version: String by project
val ktor_version: String by project
val kotlin_version: String by project
val koin_version: String by project

plugins {
    application
    kotlin("jvm") version "1.3.50"
}

group = "ru.barinov"
version = "0.0.1-SNAPSHOT"

application {
    mainClassName = "io.ktor.server.netty.DevelopmentEngine"
}

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("io.ktor:ktor-html-builder:$ktor_version")
    
    implementation("org.koin:koin-ktor:$koin_version")

    implementation("io.github.microutils:kotlin-logging:1.7.6")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")
kotlin.sourceSets["test"].kotlin.srcDirs("test")

sourceSets["main"].resources.srcDirs("resources")
sourceSets["test"].resources.srcDirs("testresources")
