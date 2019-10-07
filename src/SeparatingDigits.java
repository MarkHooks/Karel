import java.util.Scanner;

public class SeparatingDigits {

    public static int getquotient(int a, int b){
        int quotient = a/b;
        return quotient;

    }
    public static int getRemainder(int a, int b){
        int remainder = a%b;
        return remainder;
    }
    public static void displayDigits(int usernumone){
        int a = getquotient(usernumone, 1000);
        int b = getquotient(usernumone - (a* 1000), 100);
        int c = getRemainder(usernumone, 100);
        int d = getRemainder(usernumone, 10);

        System.out.print(a + " "+ b + " "+ (c - d)/10 +" "+ d);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your digits");

        int usernumone = scan.nextInt();
        displayDigits(usernumone);
    }
}
