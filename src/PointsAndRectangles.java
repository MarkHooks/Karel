import java.awt.*;
import java.util.Scanner;

public class PointsAndRectangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xcoordinates;
        int ycoordinates;
        int length;
        int width;

        System.out.print("enter the x coordinates");
        xcoordinates = scan.nextInt();
        System.out.print("enter the y coordinates");
        ycoordinates = scan.nextInt();
        System.out.println("enter the length");
        length = scan.nextInt();
        System.out.println("enter the width");
        width = scan.nextInt();
        Rectangle rec = new Rectangle(xcoordinates, ycoordinates, length, width);
        Point point = new Point(xcoordinates, ycoordinates);
        Dimension dimension = new Dimension(length, width);
        System.out.println(point);
        System.out.println(dimension);
        System.out.println(rec);

        // Point(x, y)
        // Dimension(length, width)
        // Rectangle(Point, Dimension)

    }
}
