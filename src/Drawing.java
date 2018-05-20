
import java.util.Collections;
import java.util.List;

public class Drawing extends Figure {

    public List<Figure> components;

    public Drawing(double x, double y, List<Figure> components) {
        super(x, y);
        this.components = components;
    }

    public List<Figure> getComponents() {
        return Collections.unmodifiableList(components);
    }

    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }
}
