package factory_pattern.simple_factory_method;

public class NYStyleCheesePizza extends Pizza {
    
    public NYStyleCheesePizza() {
        name = "NY style sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinana Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
