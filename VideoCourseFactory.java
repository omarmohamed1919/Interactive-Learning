public class VideoCourseFactory implements ModuleFactory {
    private String title;
    private int duration;
    private String videoUrl;

    public VideoCourseFactory(String title, int duration, String videoUrl) {
        this.title = title;
        this.duration = duration;
        this.videoUrl = videoUrl;
    }

    @Override
    public LearningModule createModule() {
        return new VideoCourse(title, duration, videoUrl);
    }
}