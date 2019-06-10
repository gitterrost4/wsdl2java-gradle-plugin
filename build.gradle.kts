plugins {
    kotlin("jvm") version "1.3.31"
    id("java-gradle-plugin")
    id("com.gradle.plugin-publish") version "0.10.1"
}

group = "com.github.bjornvester"
version = "0.1"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

gradlePlugin {
    plugins {
        create("wsdl2JavaPlugin") {
            id = "com.github.bjornvester.wsdl2java"
            implementationClass = "com.github.bjornvester.wsdl2java.Wsdl2JavaPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/bjornvester/wsdl2java-gradle-plugin"
    vcsUrl = "https://github.com/bjornvester/wsdl2java-gradle-plugin"
    description = "Adds CXF wsdl2java tool to your project. Please see the Github project page for details."
    (plugins) {
        "wsdl2JavaPlugin" {
            displayName = "Gradle Wsdl2Java plugin"
            tags = listOf("wsdl2java", "cxf", "wsimport")
        }
    }
}