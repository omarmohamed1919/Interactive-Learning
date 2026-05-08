import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("🎓 ONLINE EDUCATION SYSTEM - MODULE CREATION DEMO\n");

        LearningPlatform platform = new LearningPlatform();

        System.out.println("DEMO 1: Creating Video Course using Factory");
        System.out.println("-".repeat(40));

        VideoCourseFactory videoFactory = new VideoCourseFactory(
                "Java Programming Fundamentals",
                120,
                "https://platform.com/videos/java-fundamentals"
        );
        LearningModule videoCourse = videoFactory.createModule();
        platform.deliverModule(videoCourse);

        System.out.println("\n\n" + "=".repeat(60) + "\n");


        System.out.println("DEMO 2: Creating Interactive Quiz and Tutorial using Factory");
        System.out.println("-".repeat(40));

        InteractiveLearningFacttory interactiveFactory = new InteractiveLearningFacttory();

        List<String> quizQuestions = Arrays.asList(
                "What is polymorphism in Java?",
                "Explain inheritance with an example",
                "What are the differences between abstract class and interface?"
        );

        LearningModule quiz = interactiveFactory.createQuiz(
                "Java OOP Concepts Quiz",
                quizQuestions,
                30
        );

        LearningModule tutorial = interactiveFactory.createTutorial(
                "Understanding Design Patterns",
                "Design patterns are typical solutions to common problems in software design...",
                45
        );

        platform.deliverModule(quiz);
        System.out.println();
        platform.deliverModule(tutorial);

        System.out.println("\n\n" + "=".repeat(60) + "\n");


        System.out.println("DEMO 3: Creating Course Package using Composite Pattern");
        System.out.println("-".repeat(40));

        ModuleComposite javaMasterClass = new ModuleComposite("Java MasterClass");


        VideoCourseFactory javaBasicsFactory = new VideoCourseFactory(
                "Java Basics",
                90,
                "https://platform.com/videos/java-basics"
        );

        VideoCourseFactory javaAdvancedFactory = new VideoCourseFactory(
                "Advanced Java",
                150,
                "https://platform.com/videos/advanced-java"
        );

        List<String> finalQuizQuestions = Arrays.asList(
                "Question 1: Explain JVM architecture",
                "Question 2: What are Java Collections?",
                "Question 3: Explain multithreading concepts",
                "Question 4: What are lambda expressions?",
                "Question 5: Explain Stream API"
        );


        javaMasterClass.addModule(javaBasicsFactory.createModule());
        javaMasterClass.addModule(javaAdvancedFactory.createModule());
        javaMasterClass.addModule(interactiveFactory.createQuiz(
                "Java Final Assessment",
                finalQuizQuestions,
                60
        ));
        javaMasterClass.addModule(interactiveFactory.createTutorial(
                "Java Best Practices",
                "This tutorial covers best practices for Java development including...",
                60
        ));


        platform.deliverCoursePackage(javaMasterClass);


        System.out.println("\n\n" + "=".repeat(60));
        System.out.println("DEMO 4: Course Package Structure");
        System.out.println("=".repeat(60));
        javaMasterClass.display();
    }
}