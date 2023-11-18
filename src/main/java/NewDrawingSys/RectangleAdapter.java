package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;

public class RectangleAdapter implements Shape {
    private Rectangle oldRectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.oldRectangle = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int width = x2 - x1;
        int height = y2 - y1;
        oldRectangle.draw(x1, y1, width, height);
    }
}
