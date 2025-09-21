package visitor_pattern;

public class PriceCalculatorVisitor implements MenuVisitor {
    private double totalPrice = 0;
    
    @Override
    public void visit(Appetizer appetizer) {
        totalPrice += appetizer.getPrice();
        System.out.println("Adding appetizer: " + appetizer.getName() + " ($" + appetizer.getPrice() + ")");
    }
    
    @Override
    public void visit(MainCourse mainCourse) {
        totalPrice += mainCourse.getPrice();
        System.out.println("Adding main course: " + mainCourse.getName() + " ($" + mainCourse.getPrice() + ")");
    }
    
    @Override
    public void visit(Dessert dessert) {
        totalPrice += dessert.getPrice();
        System.out.println("Adding dessert: " + dessert.getName() + " ($" + dessert.getPrice() + ")");
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
}
