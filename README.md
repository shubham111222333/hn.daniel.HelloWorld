# hn.daniel.HelloWorld

A simple example of a jar library built using [Gradle](https://gradle.org/).

## Requirements

- [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.7 or higher
- [Gradle](https://gradle.org/install/)

## Building

The following commands will create: `build/libs/helloworld-0.1.0.jar`

```bash
gradle clean
gradle buildJar
```

## Example Usage

Copy the generated jar file to your project's lib directory.

```java
import hn.daniel.HelloWorld;
...
String helloWorld = HelloWorld.hello();
System.out.println(helloWorld);
String helloDaniel = HelloWorld.hello("Daniel");
System.out.println(helloDaniel);
```

#### Output:

```
Hello world!
Hello Daniel!
```
