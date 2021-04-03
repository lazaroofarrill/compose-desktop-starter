import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    kotlin("jvm") version "1.4.31"
    id("org.jetbrains.compose") version "0.4.0-build178"
}

group = "me.lazt"
version = "1.0.0"

repositories {
//    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}



dependencies {
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-collections-immutable-jvm
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.4")
    implementation(compose.desktop.currentOs)
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "untitled"
        }
    }
}