package visitor_pattern;

public class MenuDisplayVisitor implements MenuVisitor {
    
    @Override
    public void visit(Appetizer appetizer) {
        System.out.println("🥗 APPETIZER: " + appetizer.getName() + " - $" + appetizer.getPrice());
    }
    
    @Override
    public void visit(MainCourse mainCourse) {
        System.out.println("🍽️ MAIN COURSE: " + mainCourse.getName() + " - $" + mainCourse.getPrice());
    }
    
    @Override
    public void visit(Dessert dessert) {
        System.out.println("🍰 DESSERT: " + dessert.getName() + " - $" + dessert.getPrice());
    }
}
