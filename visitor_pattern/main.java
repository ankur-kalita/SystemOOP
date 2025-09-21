package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Create menu items
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new Appetizer("Caesar Salad", 8.99));
        menu.add(new MainCourse("Grilled Salmon", 24.99));
        menu.add(new Dessert("Chocolate Cake", 6.99));
        menu.add(new Appetizer("Soup of the Day", 5.99));
        menu.add(new MainCourse("Ribeye Steak", 32.99));
        
        // Display menu using visitor
        System.out.println("=== RESTAURANT MENU ===");
        MenuDisplayVisitor displayVisitor = new MenuDisplayVisitor();
        for (MenuItem item : menu) {
            item.accept(displayVisitor);
        }
        
        System.out.println("\n=== CALCULATING ORDER TOTAL ===");
        // Calculate total price using visitor
        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        for (MenuItem item : menu) {
            item.accept(priceVisitor);
        }
        
        System.out.println("\nTotal Order Price: $" + priceVisitor.getTotalPrice());
    }
}
