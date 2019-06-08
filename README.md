[![Author](https://img.shields.io/badge/author-Daniel%20M.%20Hendricks-lightgrey.svg?colorB=9900cc&style=flat-square)](https://www.danhendricks.com/?utm_source=github.com&utm_medium=campaign&utm_content=button&utm_campaign=wordpress-mu-common-toolkit)
[![License](https://img.shields.io/badge/license-MIT-yellow.svg?style=flat-square)](https://github.com/dmhendricks/hn.daniel.HelloWorld/blob/master/LICENSE)
[![DigitalOcean](https://img.shields.io/badge/hosting-Digital%20Ocean-green.svg?style=flat-square&label=hosting&colorB=0152FF)](https://m.do.co/t/8a88362f5683?utm_source=github.com&utm_medium=campaign&utm_content=button&utm_campaign=dmhendricks%2Fwordpress-mu-common-toolkit)
[![Twitter](https://img.shields.io/twitter/url/https/github.com/dmhendricks/wordpress-mu-common-toolkit.svg?style=social)](https://twitter.com/danielhendricks)

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

#### Output

```
Hello world!
Hello Daniel!
```

[![Analytics](https://ga-beacon.appspot.com/UA-126205765-1/dmhendricks/dmhendricks/hn.daniel.HelloWorld?flat)](https://ga-beacon.appspot.com/?utm_source=github.com&utm_medium=referral&utm_content=button&utm_campaign=dmhendricks%2Fdmhendricks/hn.daniel.HelloWorld)
