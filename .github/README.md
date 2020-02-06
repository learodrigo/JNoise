# JNoise
![banner](banner.png)

[![license](https://img.shields.io/github/license/articdive/JNoise.svg)](../LICENSE)
[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)

JNoise is a simple-to-use java-library for generating noise (including gradient noise) in Java.

JNoise was created in early 2020 by Lukas Mansour (Articdive). It was created for a project in MineCraft for custom terrain generation. It works for all java 8+ apps and is built using [Maven](http://maven.apache.org/).

## Table of Contents
- [Install](#install)
- [Usage](#usage)
- [Maintainers](#maintainers)
- [Acknowledgements](#acknowledgements)
- [Contributing](#contributing)
- [License](#license)

## Install
### Maven and Gradle
To add JNoise to your project using [Gradle](https://gradle.org/) or [Maven](http://maven.apache.org/):

Repository:
```

```
Dependency:
```

```
## Usage

### Picking your Noise-Type.
The JNoise library supports Perlin, OpenSimplex, Value and white noise.

It also supports fractals or octavated versions of Perlin, OpenSimplex and Value noise.

Every noise-type has different features, e.g. Perlin Noise supports different types of Interpolation, whereas OpenSimplex does not support Interpolation.

These are all documented in the respective builders/generators of the noise-type.

Normally if you are using an IDE, the code-completition is intuitive enough to use this library without having to check for features.

Example: Creating a Noise-Generator using Perlin Noise with Cosine Interpolation.
```java
        JNoise perlinCosine = JNoise.newBuilder().perlin().setInterpolationType(InterpolationType.COSINE).setSeed(1729).build();
```

### Getting Normal Noise Values
The Noise's dimension has to do with the amount of parameters. If you add one double after the getNoise method, you will receive 1 dimensional noise.

All Noise Implementations support 2D,3D and 4D noise.

Example: Getting 1D Perlin-Noise:
```java
    private double getNoise(double x) {
        JNoise perlinLinear = JNoise.newBuilder().perlin().setInterpolationType(InterpolationType.LINEAR).setSeed(1629).build();
        // 1D Noise
        return perlinLinear.getNoise(x)
    }
```
Example: Getting 2D Perlin-Noise:
```java
    private double getNoise(double x, double y) {
        JNoise perlinLinear = JNoise.newBuilder().perlin().setInterpolationType(InterpolationType.LINEAR).setSeed(1629).build();
        // 2D Noise
        return perlinLinear.getNoise(x, y)
    }
```

### Getting Fractals (Octavated) Noise Values
In this case way to get Noise values is the exact same (using getNoise()), except in the creation of your builder you prefix octave to your noise type.

Example: Creating a Noise-Generator using Octavated Perlin Noise with Cosine Interpolation.
```java
    JNoise perlinCosine = JNoise.newBuilder().octavePerlin().setInterpolationType(InterpolationType.COSINE).setSeed(1629).setOctaves(4).setPersistence(0.5).setLacunarity(0.5).build();
```

## Maintainers
[@Articdive](https://www.github.com/Articdive/)

## Acknowledgements
[@Ken Perlin](https://mrl.nyu.edu/~perlin/)'s work on Perlin Noise and SimplexNoise.

[@Kurt Spencer](https://www.github.com/KDotJpg)'s work on OpenSimplexNoise located [here](https://gist.github.com/KdotJPG/b1270127455a94ac5d19).

## Contributing
See [the contributing file](CONTRIBUTING.md)!

## License
[GNU General Public License v3.0 or later © Lukas Mansour (Articdive) ](../LICENSE)