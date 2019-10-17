import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstname;
        String lastname;
        String middlename;
        int age;
        String pass;
        String pass2;
        int pass3;
        System.out.print("Please enter your first name:");
        firstname = scan.nextLine();
        System.out.print("Please enter your middle name:");
        middlename = scan.nextLine();
        System.out.print("Please enter your last name:");
        lastname = scan.nextLine();
        System.out.print("Please enter your age:");
        age = scan.nextInt();
        pass = (firstname.substring(firstname.length() / 2, firstname.length() / 2+1)) + (middlename.substring(middlename.length() / 2, middlename.length() / 2+1) + (lastname.substring(lastname.length() / 2, lastname.length() / 2+1)));
        String pass1 = pass.toUpperCase();
        System.out.print(pass1);
        pass2 = firstname.substring(firstname.length() - 1, firstname.length())+ middlename.substring(middlename.length() - 1, middlename.length()) + lastname.substring(lastname.length() - 1, lastname.length());
        System.out.print(pass2);
        pass3 = age * 72;
        System.out.print(pass3);




    }
}
