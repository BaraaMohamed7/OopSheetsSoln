plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc
    implementation("org.xerial:sqlite-jdbc:3.46.0.1")
    // https://mvnrepository.com/artifact/com.fasterxml.uuid/java-uuid-generator
    implementation("com.fasterxml.uuid:java-uuid-generator:5.1.0")
}

tasks.test {
    useJUnitPlatform()
}