package factory_pattern.simple_factory_method;

public class NYPizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } 
        // } else if (type.equals("veggie")) {
        //     return new NYStyleVeggiePizza();
        // } else if (type.equals("clam")) {
        //     return new NYStyleClamPizza();
        // } else if (type.equals("pepperoni")) {
        //     return new NYStylePepperoniPizza();
        // } else {
        //     return null;
        // }
        return pizza;
    }
}
