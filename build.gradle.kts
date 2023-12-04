plugins {
    kotlin("jvm") version "1.9.21"
    id("io.ktor.plugin") version "2.3.6"
}

repositories {
    mavenCentral()
}

sourceSets {
    main {
        kotlin.srcDirs("src")
    }
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

application {
    mainClass.set("MainKt")
    applicationName = "app"
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:2.3.6")
    implementation("io.ktor:ktor-server-netty-jvm:2.3.6")
    implementation("org.slf4j:slf4j-simple:2.0.9")
}
