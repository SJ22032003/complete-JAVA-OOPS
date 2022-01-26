import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your desire number = ");
                int a = sc.nextInt();
            for (int i = 0; i <= a; i++) {
                    System.out.println(i);
            }
        }
    }
}
