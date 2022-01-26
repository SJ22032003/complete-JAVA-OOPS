import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculate your Result");

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your English Marks = ");
                float mark1 = sc.nextShort();
            System.out.print("Enter Your Math Marks = ");
                float mark2 = sc.nextShort();
            System.out.print("Enter Your Physics Marks = ");
                float mark3 = sc.nextShort();
            System.out.print("Enter Your Chemistry Marks = ");
                float mark4 = sc.nextShort();
            System.out.print("Enter Your Hindi Marks = ");
                float mark5 = sc.nextShort();
            
            // Result 
            System.out.println("You got "+ (mark1+mark2+mark3+mark4+mark5) + " out of 500");
            System.out.println("Your Percentage is  " + ((mark1+mark2+mark3+mark4+mark5)/500)*100 );
        }
    }
}
