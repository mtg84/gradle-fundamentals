allProjects {
    apply(plugin="java")
    version = "1.0.SNAPSHOT"
}

project(":Repository"){}

project(":JacketService"){
    dependencies{
        "implementation"(project(":Repository"))
    }
}