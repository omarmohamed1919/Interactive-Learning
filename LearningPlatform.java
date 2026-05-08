public class LearningPlatform {

    public void deliverModule(LearningModule module) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("LEARNING PLATFORM - MODULE DELIVERY");
        System.out.println("=".repeat(50));

        module.create();
        System.out.println();
        module.integrate();
        System.out.println();
        module.access();

        System.out.println("\nModule delivery completed successfully!");
        System.out.println("=".repeat(50));
    }

    public void deliverCoursePackage(ModuleComposite composite) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("LEARNING PLATFORM - COURSE PACKAGE DELIVERY");
        System.out.println("=".repeat(50));

        composite.display();
        composite.create();
        composite.integrate();
        composite.access();

        System.out.println("\nCourse package delivery completed successfully!");
        System.out.println("=".repeat(50));
    }
}
