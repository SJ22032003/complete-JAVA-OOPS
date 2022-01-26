import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Taking input from the user");
        try (Scanner sc = new Scanner(System.in)) {
            //Getting Input-----------------------------------
            System.out.print("Enter your 1st no. : ");
                int a = sc.nextInt();
            System.out.print("Enter your 2nd no. : ");
                int b = sc.nextInt();

            // Boolean---------------------------------------
            System.out.print("Enter no to check Int : ");
                boolean t = sc.hasNextInt();

            // String----------------------------------------
            System.out.print("Enter String : ");
                String str = sc.nextLine();

            // Input Result---------------------------------
            System.out.println("Your Answer : " + (a + b));
            System.out.println("Your Result : " + t);
            System.out.println("Your String : " + str);
        }
    }
}
