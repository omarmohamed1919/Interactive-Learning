import java.util.List;

public class InteractiveQuiz implements LearningModule {
    private String title;
    private List<String> questions;
    private int timeLimit;

    public InteractiveQuiz(String title, List<String> questions, int timeLimit) {
        this.title = title;
        this.questions = questions;
        this.timeLimit = timeLimit;
    }

    @Override
    public void create() {
        System.out.println("Creating interactive quiz: " + title);
        System.out.println("Number of questions: " + questions.size());
        System.out.println("Time limit: " + timeLimit + " minutes");
        System.out.println("Generating question bank...");
        System.out.println("Setting up scoring system...");
    }

    @Override
    public void integrate() {
        System.out.println("Integrating quiz with learning platform");
        System.out.println("Configuring quiz engine");
        System.out.println("Setting up real-time grading");
        System.out.println("Configuring feedback system");
    }

    @Override
    public void access() {
        System.out.println("Granting learner access to quiz: " + title);
        System.out.println("Setting attempt limits");
        System.out.println("Configuring timer");
        System.out.println("Enabling result tracking");
    }

    @Override
    public void display() {
        System.out.println("Quiz: " + title + " (" + questions.size() + " questions)");
    }
}