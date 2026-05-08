A Java-based educational platform demonstrating key object-oriented design patterns including Factory, Abstract Factory, and Composite.

Features
Create different types of learning modules:

 Video Courses

 Written Tutorials

 Interactive Quizzes

Combine modules into structured learning paths using the Composite pattern

Factory pattern for flexible module creation

Interactive console-based interface

Design Patterns Used
Factory – Creates individual learning modules

Abstract Factory – Creates families of related modules

Composite – Groups modules into learning paths

Project Structure
text
src/
├── Main.java                      # Entry point
├── LearningPlatform.java          # Core platform logic
├── LearningModule.java            # Module interface
├── ModuleComposite.java           # Composite for module groups
├── VideoCourse.java               # Video module implementation
├── WrittenTutorial.java           # Text module implementation
├── InteractiveQuiz.java           # Quiz module implementation
├── ModuleFactory.java             # Factory interface
├── VideoCourseFactory.java        # Factory for video courses
├── InteractiveLearningFactory.java # Abstract factory
└── ...
Getting Started
Prerequisites
Java 8 or higher

IntelliJ IDEA (recommended)

Run the application
bash
javac src/*.java
java -cp src Main
Usage
The platform allows you to:

Create individual learning modules

Build composite learning paths

Launch interactive quizzes

Track progress through modules

Author
Educational project for demonstrating OOP design patterns.

