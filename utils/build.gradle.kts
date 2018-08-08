plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

gradlePlugin {
    (plugins) {
        "my-gradle-plugin" {
            id = "mygradleplugin"
            implementationClass = "com.example.MyPlugin"
        }
    }
}

dependencies {
    implementation(gradleApi())
}