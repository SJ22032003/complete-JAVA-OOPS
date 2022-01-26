import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Switch Case");
        try(Scanner sc = new Scanner(System.in)){
            int age = sc.nextInt();
            
            switch (age) {
                case 18:
                    System.out.println("You can Drink");
                    break;
                case 20:
                    System.out.println("You can Drink");
                    break;
                case 47:
                    System.out.println("You can Drink");
                    break;
            
                default:
                    System.out.println("Cannot Drink");
                    break;
            }
        }
    }
}
