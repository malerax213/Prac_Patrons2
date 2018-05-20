
import java.util.List;

public class AreaVisitor implements FigureVisitor {

    private double rectangleArea;
    private double circleArea;
    private List<Double> drawArea;

    @Override
    public void visit(Rectangle rectangle) {

    }

    @Override
    public void visit(Circle circle) {

    }

    @Override
    public void visit(Drawing draw) {

    }

    public double getArea(Rectangle rectangle) {
        return rectangleArea;
    }

    public double getArea(Circle circle) {
        return circleArea;
    }

    public List<Double> getArea(Drawing draw) {
        return drawArea;
    }

}
