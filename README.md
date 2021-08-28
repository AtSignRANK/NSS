# NSS
N Sided Shape

Maven ( pom.xml )
```xml
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
    <groupId>com.github.AtSignRANK</groupId>
    <artifactId>NSS</artifactId>
    <version>Tag</version>
</dependency>
```

Groovy DSL ( build.gradle )
```gradle
repositories {
  mavenCentral()
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.AtSignRANK:NSS:Tag'
}
```

Kotlin DSL ( build.gradle.kts )
```kts
repositories {
    mavenCentral()
    maven("https://jitpack.io/")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.AtSignRANK:NSS:Tag")
}
```
