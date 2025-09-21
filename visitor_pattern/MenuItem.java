package visitor_pattern;

public interface MenuItem {
    void accept(MenuVisitor visitor);
    String getName();
    double getPrice();
}
