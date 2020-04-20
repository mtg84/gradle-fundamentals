tasks.register("helllo") {
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