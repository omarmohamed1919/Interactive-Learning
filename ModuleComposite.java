import java.util.ArrayList;
import java.util.List;

public class ModuleComposite implements LearningModule {
    private String name;
    private List<LearningModule> modules = new ArrayList<>();

    public ModuleComposite(String name) {
        this.name = name;
    }

    public void addModule(LearningModule module) {
        modules.add(module);
        System.out.println("Added module to '" + name + "'");
    }

    public void removeModule(LearningModule module) {
        modules.remove(module);
        System.out.println("Removed module from '" + name + "'");
    }

    @Override
    public void create() {
        System.out.println("\nCreating course package: " + name);
        System.out.println("Total modules: " + modules.size());
        System.out.println("----------------------------------------");

        for (LearningModule module : modules) {
            module.create();
            System.out.println();
        }
        System.out.println("Course package creation completed!");
    }

    @Override
    public void integrate() {
        System.out.println("\nIntegrating entire course package: " + name);
        System.out.println("----------------------------------------");

        for (LearningModule module : modules) {
            module.integrate();
            System.out.println();
        }
        System.out.println("Course package integration completed!");
    }

    @Override
    public void access() {
        System.out.println("\nGranting access to entire course package: " + name);
        System.out.println("----------------------------------------");

        for (LearningModule module : modules) {
            module.access();
            System.out.println();
        }
        System.out.println("All modules now accessible to learners!");
    }

    @Override
    public void display() {
        System.out.println("\nCourse Package: " + name);
        System.out.println("Contents:");
        for (LearningModule module : modules) {
            System.out.print("   • ");
            module.display();
        }
    }
}