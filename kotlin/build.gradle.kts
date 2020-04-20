val log4j_version: String by project
val jaxb_version: String by project
val junit_version: String by project

plugins {
    application
    id("org.flywaydb.flyway") version "6.3.2"    
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    jcenter()
}

dependencies {
    implementation("log4j:log4j:$log4j_version")
    testImplementation("junit:junit:$junit_version")
}

version = "1.0-SNAPSHOT"

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }
    test {
        setSrcDirs(listOf("test/src"))
    }
}

// for plugin application
/* application {
    mainClassName = "com.pluralsight.security.Hash"
} */

tasks.register("hello") {
    doLast {
        print("Hello")
    }
}

tasks.register("world") {

    dependsOn("hello")

    doLast {
        println(" World")
    }
}

