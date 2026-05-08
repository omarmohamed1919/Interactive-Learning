public class VideoCourse implements LearningModule {
    private String title;
    private int duration;
    private String videoUrl;

    public VideoCourse(String title, int duration, String videoUrl) {
        this.title = title;
        this.duration = duration;
        this.videoUrl = videoUrl;
    }

    @Override
    public void create() {
        System.out.println("Creating video course: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Video URL: " + videoUrl);
        System.out.println("Encoding video ");
        System.out.println("Adding captions ");
    }
    @Override
    public void integrate() {
        System.out.println("Integrating video course with learning platform");
        System.out.println("Uploading to video server");
        System.out.println("Configuring playback settings");
        System.out.println("Setting up progress tracking");
    }
    @Override
    public void access() {
        System.out.println("Granting learner access to video course: " + title);
        System.out.println("Setting view permissions");
        System.out.println("Enabling comments and discussions");
        System.out.println("Tracking completion status");
    }
    @Override
    public void display() {
        System.out.println("Video Course: " + title + " (" + duration + " mins)");
    }
}