
public class Circle extends Figure {

    double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR(){
        return this.r;
    }
    
    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }
}
