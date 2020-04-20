plugins {
    java
    id("org.flywaydb.flyway") version "6.3.2"    
}

version = "1.0-SNAPSHOT"

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

