plugins {
    java
    id("org.flywaydb.flyway") version "6.3.2"    
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

