# How to Run Java Programs in the Terminal

    A collection of commands needed to compile and run java files in the terminal

## Default package (ie files not part of a specific package)

Note: Files that are not in a package are said to be in the "default package". It's a good practice for simple, introductory, or standalone programs, but for larger projects, using packages to organize your code is recommended.

1. Save file(s) in a .java file with no package declaration
   Example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

2. Compile Your Java File(s)
   Open a terminal or command prompt.
   Navigate to the directory containing your .java file. The java and javac commands look for files relative to the current directory.
   Compile your Java file using the javac command. For example:

```bash
javac JavaProgramName.java
```

If you need to compile multiple Java files default package files, you can list them all or use the wildcard \* to compile all Java files in the directory:

```bash
javac *.java
```

3. Run Your Compiled Java Program
   After compiling, you should have a .class file in the same directory as your .java file.
   Run your Java program using the java command followed by the name of the class (without the .class extension).
   Run this command on the file that has the main function. For example, if the main function is located
   in a file JavaProgramName.java that you compiled into JavaProgramName.class, you would use:

```bash
java JavaProgramName
```

## Package (Files collected in a single package)

1. Organize your files according to their package structure
   Place your Java files in a directory that matches the package name.
   Example: If you have

```java
package example;
public class MyClass { }
```

This file should be located in a directory path like: /path/to/your/project/example/MyClass.java

Example2: If you have

```java
package com.example.project;
public class MyClass { }
```

This file should be located in a directory path like: /path/to/your/project/com/example/project/MyClass.java

2. Compile Your Java Files
   Open a terminal or command prompt.
   Navigate to the root directory of your project (/path/to/your/project/).
   Compile your Java file using the javac command, including the path to your Java file relative to the project's root directory. For example:

```bash
javac example/MyClass.java
```

If you need to compile multiple Java files within the same package, you can list them all or use the wildcard \* to compile all Java files in the directory:

```bash
javac example/*.java
```

3. Run Your Compiled Java Class
   After compilation, the .class files will be in the same directory structure as your source files.
   Stay in the root directory of your project to run your main class.
   Use the java command with the fully qualified name of your class, which includes the package name. Do not add .class extension. For example:

```bash
java example.MyClass
```

Additional Tips

Classpath: If your program uses external libraries, include them in the classpath using the -cp or -classpath option with both javac and java commands. For example:

```bash
javac -cp ".;path/to/your/lib/*" example/MyClass.java
java -cp ".;path/to/your/lib/*" example.MyClass
```

Use : as the path separator on Unix-based systems (Linux, macOS) instead of ;.

Starting Directory: Always begin from the root of your package structure when compiling or running your classes to ensure the package hierarchy is properly respected.

Following these updated instructions will help you compile and run Java files located within an example package effectively.
