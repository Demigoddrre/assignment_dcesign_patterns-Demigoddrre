package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;
import com.mycompany.oldDrawingSys.Rectangle;

public class ModifiedSystem {
    public static void main(String[] args) {
        Shape[] shapes = {
                new CircleAdapter(new Circle()),
                new RectangleAdapter(new Rectangle())
        };
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
