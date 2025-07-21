package factory_pattern.simple_factory_method;

public class ChicagoPizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        // } else if (type.equals("pepperoni")) {
        //     pizza = new ChicagoStylePepperoniPizza();
        // } else if (type.equals("clam")) {
        //     pizza = new ChicagoStyleClamPizza();
        // } else if (type.equals("veggie")) {
        //     pizza = new ChicagoStyleVeggiePizza();
        // }

        return pizza;
    }
}
