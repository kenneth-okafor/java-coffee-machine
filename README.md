# ☕ Java Coffee Machine Application

**A Java command-line coffee machine simulation featuring object-oriented programming, multithreading, multilingual support, audio playback and logging.**

## Project Overview

The Coffee Machine Application is a Java-based command-line program developed as part of my Advanced Programming coursework at TU Dublin.

The application simulates a coffee machine that allows users to select different coffee types, experience simulated brewing times, hear audio feedback and switch between English and French.

The project demonstrates practical knowledge of object-oriented programming, exception handling, multithreading, internationalisation and integration with external Java libraries.

## Technologies Used

| Technology | Purpose |
|---|---|
| Java 24 | Application development |
| Object-Oriented Programming | Classes, inheritance and polymorphism |
| Java Threads | Simulated coffee brewing |
| Java ResourceBundle | English and French translations |
| Java Sound API | WAV audio playback |
| Custom Exceptions | Application error handling |
| External Logger Library | Application logging |
| Git & GitHub | Version control |

## Key Features

### 1. Coffee Selection

Users can choose between three coffee types:

- Latte
- Americano
- Espresso

Each coffee type is represented by its own Java class extending the base `Coffee` class.

### 2. Multithreading

The application uses Java's `Runnable` interface and threading to simulate coffee preparation.

Each coffee has a defined brewing duration, allowing the application to demonstrate thread execution and timing.

### 3. Multilingual Support

Users can switch between English and French.

The application uses Java's `ResourceBundle` functionality to retrieve translated menu options and messages from:

- `messages_en.properties`
- `messages_fr.properties`

### 4. Audio Playback

Each coffee type has an associated WAV sound file.

The `SoundPlayer` class uses the Java Sound API to load and play audio when a coffee is selected.

### 5. Exception Handling

A custom `InvalidCoffeeException` class is included to support handling invalid coffee selections.

The application also uses exception handling for audio-related errors.

### 6. Logging Integration

The application includes an `AssignmentLogger` class and integrates an external logging library.

This demonstrates the use of third-party Java dependencies and application logging.

## Project Structure

```text
Coffee Machine/
├── src/
│   ├── coffeetype/
│   │   ├── Coffee.java
│   │   ├── CoffeeMaker.java
│   │   ├── Latte.java
│   │   ├── Americano.java
│   │   ├── Espresso.java
│   │   └── SoundPlayer.java
│   ├── exceptions/
│   │   └── InvalidCoffeeException.java
│   ├── internationalization/
│   │   └── LanguageManager.java
│   ├── logging/
│   │   └── AssignmentLogger.java
│   ├── menu/
│   │   ├── Main.java
│   │   └── Menu.java
│   ├── sounds/
│   │   ├── Latte.wav
│   │   ├── Americano.wav
│   │   └── Espresso.wav
│   ├── messages_en.properties
│   └── messages_fr.properties
├── .gitignore
└── README.md
```

## Example Program Output

```text
==== Coffee Machine ====
1. Latte
2. Americano
3. Espresso
4. Switch Language
5. Exit

Choose an option: 1

Preparing Latte...
Latte Your coffee is ready!
```

**French Language Example**

```text
==== Machine à café ====
1. Latte
2. Américain
3. Expresso
4. Changer de langue
5. Quitter

Choisissez une option : 3

Préparation Espresso...
Espresso Votre café est prêt !
```

## Installation and Setup

### Prerequisites

- Java JDK 24
- IntelliJ IDEA or another Java IDE
- External `logger.jar` dependency used in the assignment

### Running the Application

1. Clone the repository:

```bash
git clone https://github.com/kenneth-okafor/java-coffee-machine.git
```

2. Open the downloaded project in IntelliJ IDEA.

3. Configure the Java SDK to JDK 24.

4. Add the required external `logger.jar` dependency to the project's module dependencies.

5. Ensure the `src` folder is configured as a source root and the translation properties files are available on the runtime classpath.

6. Set the working directory to the project root so the application can locate its sound files.

7. Run the `Main.java` class inside the `menu` package.

**Note:** The external logger library is not included in this repository. It must be obtained separately with appropriate permission.

## Skills Demonstrated

- Object-oriented programming
- Inheritance and polymorphism
- Java class design
- Multithreading and Runnable
- Custom exception handling
- File and resource management
- Java internationalisation
- Audio integration
- External library integration
- Debugging and problem-solving
- Git version control

## Future Improvements

Potential enhancements include:

- Graphical user interface using JavaFX
- Coffee customisation options
- Ingredient inventory management
- Improved audio resource handling
- Automated unit testing
- More language options

## Author

**Kenneth Jr Okafor**

BSc Computing (Informatics) — TU Dublin

[GitHub Profile](https://github.com/kenneth-okafor)

Developed as part of an Advanced Programming academic project.
