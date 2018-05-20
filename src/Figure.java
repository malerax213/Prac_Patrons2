
public abstract class Figure {
    double x;
    double y;
    
    public Figure(double x, double y){
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public abstract void accept(FigureVisitor fv);
}
