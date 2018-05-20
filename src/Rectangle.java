
public class Rectangle extends Figure {

    double width;
    double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }
}
