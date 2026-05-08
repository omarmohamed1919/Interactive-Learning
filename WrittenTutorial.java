public class WrittenTutorial implements LearningModule {
    private String title;
    private String content;
    private int readingTime;

    public WrittenTutorial(String title, String content, int readingTime) {
        this.title = title;
        this.content = content;
        this.readingTime = readingTime;
    }

    @Override
    public void create() {
        System.out.println("Creating written tutorial: " + title);
        System.out.println("Content length: " + content.length() + " characters");
        System.out.println("Estimated reading time: " + readingTime + " minutes");
        System.out.println("Formatting content...");
        System.out.println("Adding code examples...");
    }

    @Override
    public void integrate() {
        System.out.println("Integrating tutorial with learning platform");
        System.out.println("Formatting for web viewing");
        System.out.println("Adding table of contents");
        System.out.println("Configuring print settings");
    }

    @Override
    public void access() {
        System.out.println("Granting learner access to tutorial: " + title);
        System.out.println("Setting read permissions");
        System.out.println("Enabling bookmarking");
        System.out.println("Tracking reading progress");
    }

    @Override
    public void display() {
        System.out.println("Tutorial: " + title + " (" + readingTime + " min read)");
    }
}