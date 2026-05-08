import java.util.List;

public class InteractiveLearningFacttory {

    public LearningModule createQuiz(String title, List<String> questions, int timeLimit) {
        return new InteractiveQuiz(title, questions, timeLimit);
    }

    public LearningModule createTutorial(String title, String content, int readingTime) {
        return new WrittenTutorial(title, content, readingTime);
    }
}