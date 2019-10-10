import javax.xml.namespace.QName;
import java.util.Scanner;

public class TheNameGame {

    public static String uppercase(String name){
        String upername = name.toUpperCase();
        return upername;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String name = scan.next();
        System.out.println("Please enter your last name: ");
        String lastname = scan.next();
        System.out.println(name+" " +name +", bo-Bifty\n" + "Banana-fana fo-Fifty\n" + "Fee-fi-mo-Mifty\n" + uppercase(name));
        System.out.println(lastname+ " "+ lastname+", bo-Bent\n" + "Banana-fana fo-Fent\n" + "Fee-fi-mo-Ment\n" + uppercase(lastname));
    }
}
