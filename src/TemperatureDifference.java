import java.util.Scanner;

public class TemperatureDifference {
    private static int usertemp(){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your first temp: ");
        int usertempone = scan.nextInt();
        return usertempone;
    }
    private static int usertemptwo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your second temp:");
        int usertempt = scan.nextInt();
        return usertempt;
    }
    private static int tempdiff(int usertempone, int usertempt){

        int tempdi = usertempone - usertempt;
        int realtemp = tempdi * -1;
        System.out.print(realtemp);
        return realtemp;

    }
    public static void main(String[] args) {
        tempdiff(usertemp(), usertemptwo());
    }


}
