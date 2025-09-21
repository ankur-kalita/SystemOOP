package visitor_pattern;

public class Appetizer implements MenuItem {
    private String name;
    private double price;
    
    public Appetizer(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
}
