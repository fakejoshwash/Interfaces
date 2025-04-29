import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Rectangle rectangle01 = new Rectangle(3, 2);
        Rectangle rectangle02 = new Rectangle(3, 1);
        Rectangle rectangle03 = new Rectangle(4, 1);
        Rectangle rectangle04 = new Rectangle(2, 3);
        Rectangle rectangle05 = new Rectangle(1, 3);
        Rectangle rectangle06 = new Rectangle(5, 6); // perimeters greater than 10
        Rectangle rectangle07 = new Rectangle(7, 5);
        Rectangle rectangle08 = new Rectangle(8, 4);
        Rectangle rectangle09 = new Rectangle(9,3);
        Rectangle rectangle10 = new Rectangle(14,8);
        rectangles.add(rectangle01);
        rectangles.add(rectangle02);
        rectangles.add(rectangle03);
        rectangles.add(rectangle04);
        rectangles.add(rectangle05);
        rectangles.add(rectangle06);
        rectangles.add(rectangle07);
        rectangles.add(rectangle08);
        rectangles.add(rectangle09);
        rectangles.add(rectangle10);
        BigRectangleFilter filter = new BigRectangleFilter();
        for(Rectangle rectangle : rectangles) {
            if(filter.accept(rectangle)) {
                System.out.println(rectangle);
            }
        }
    }
}
