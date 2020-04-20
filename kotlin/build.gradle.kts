task.register("helllo") {
    doLast {
        print("Hello")
    }
}

task.register("world") {

    dependsOn("hello")

    doLast {
        println(" World")
    }
}