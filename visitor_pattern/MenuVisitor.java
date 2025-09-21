package visitor_pattern;

public interface MenuVisitor {
    void visit(Appetizer appetizer);
    void visit(MainCourse mainCourse);
    void visit(Dessert dessert);
}
