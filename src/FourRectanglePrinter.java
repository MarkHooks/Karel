import java.util.Scanner;
import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle box = new Rectangle(0, 0, 5,10);
        System.out.println(box);
        box.translate((int)box.getWidth(), (int)box.getHeight());
        System.out.println(box);
        box.translate(0, -(int)box.getHeight());
        System.out.println(box);
        box.translate(-(int)box.getWidth(), 0);
        System.out.println(box);
    }
}
