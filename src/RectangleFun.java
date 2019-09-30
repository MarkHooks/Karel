import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int height;
        int width;

        System.out.print("enter the x coordinates");
        x = scan.nextInt();
        System.out.print("enter the y coordinates");
        y = scan.nextInt();
        System.out.print("enter the length");
        height = scan.nextInt();
        System.out.print("enter the width");
        width = scan.nextInt();
        Rectangle rec = new Rectangle(x, y, height, width);
        double perimeter = (2*(rec.getHeight() + rec.getWidth()));
        System.out.println("Your perimeter is "+perimeter);
        rec.setLocation((int)(rec.getX() - 4), (int)(rec.getY() + 2));
        System.out.println("New location is ("+rec.getX()+", "+ rec.getY()+")");
    }
}
