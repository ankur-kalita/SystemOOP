package template_method_pattern;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // Hook method
            addCondiments();
        }
    }
    // primitive operations to be implemented by subclasses
    abstract void brew();

    abstract void addCondiments();

    // concrete operations
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Default implementation of the hook method
    boolean customerWantsCondiments() {
        return true; // Default to true, subclasses can override
    }
}