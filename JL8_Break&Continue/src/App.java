import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Break and Continue");
        try(Scanner sc = new Scanner(System.in)){

            //break----------------
            for (int i = 1; i <= 10; i++) {
                System.out.println("JAVA " + i);
                if (i == 8) {
                    System.out.println("Ending Loop");
                    break;
                }
                
            }
            //continue-------------
            for (int i = 1; i <= 10; i++) {
                
                if (i == 8) {
                    System.out.println("Ending Loop");
                    continue;
                }
                System.out.println("JAVA " + i);
            }
        }
    }
}
