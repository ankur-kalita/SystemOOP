package factory_pattern;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createDauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
