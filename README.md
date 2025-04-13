# What is a Klass in Java?

This repository contains example code and explanations based on the Medium post **"What is a Klass in Java Programming?"**. The project demonstrates how the Java Virtual Machine (JVM) internally represents classes using a *Klass* data structure. While the internal details of a Klass are not directly accessible from your Java code, this repository explores related concepts using Java Reflection and [JOL (Java Object Layout)](https://openjdk.org/projects/code-tools/jol/).

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
  - [Running the Reflection Example](#running-the-reflection-example)
  - [Running the JOL Demo](#running-the-jol-demo)
- [Dependencies](#dependencies)
- [License](#license)

## Overview
In Java, while you routinely write classes using the `class` keyword, the JVM internally represents each class using a structure called a **Klass**. This repository includes:

- A **Reflection Example** to display class metadata using Java Reflection.  
- A **JOL Demo** that inspects the memory layout of the `java.lang.String` class.

These examples provide insight into how Java’s runtime environment handles class metadata and memory layout.

## Project Structure
```
.
├── pom.xml
└── src
    ├── main
         └── java
             └── com
                 └── example
                     ├── ReflectionExample.java    // Demonstrates runtime metadata using reflection
                     └── JOLDemo.java              // Uses JOL to print memory layout of a class
    
```

## Prerequisites
- Java 21 – Ensure you have Java 21 installed.

- Maven – This project uses Maven for build and dependency management.

## Installation
1. Clone the repository:
```bash
git clone https://github.com/kaly7dev/Klass-in-Java.git
cd what-is-a-klass-in-java
```

2. Build the project using Maven:
```bash
mvn clean install
```
This command compiles the code and downloads required dependencies.

## Usage
### Running the Reflection Example
This example uses Java Reflection to print the metadata of java.lang.String.

1. Compile the project (if not already compiled):
```bash
mvn compile
```

2. Run the ReflectionExample main class:
```bash
mvn exec:java -Dexec.mainClass="com.example.ReflectionExample"
```
You should see output similar to the following, listing the class name, its superclass, and its declared methods:
```
Class Name: java.lang.String
Superclass: java.lang.Object

Declared Methods:
 - charAt
 - compareTo
 - concat
 - equals
...
```

## Running the JOL Demo
This demo uses the Java Object Layout (JOL) library to print the memory layout of the java.lang.String class.

1. Make sure the project is compiled:
```bash
mvn compile
```

2. Run the JOLDemo main class:
```bash
mvn exec:java -Dexec.mainClass="com.example.JOLDemo"
```
The JOL output will detail the memory layout of a String object including header details, field layout, and object alignment information.

## Dependencies
The primary dependencies for this project are:

- JOL (Java Object Layout):
```xml
<dependency>
    <groupId>org.openjdk.jol</groupId>
    <artifactId>jol-core</artifactId>
    <version>0.16</version>
</dependency>
```
(Adjust the version as necessary based on the latest available release.)

Other dependencies are managed through Maven, as defined in the `pom.xml`.

## License
This project is licensed under the GNU GENERAL PUBLIC LICENSE. See the [LICENSE](./LICENSE) file for details.