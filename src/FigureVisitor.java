
public interface FigureVisitor {

    void visit(Rectangle rectangle);

    void visit(Circle circle);

    void visit(Drawing draw);
}
