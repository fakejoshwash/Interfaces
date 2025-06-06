import java.awt.Rectangle;
public class BigRectangleFilter implements Filter{
    Rectangle x = new Rectangle();
    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle) {
            Rectangle rect = (Rectangle) x;
            return 2 * (rect.getWidth() + rect.getHeight()) > 10;
        }
        return false;
    }
}
