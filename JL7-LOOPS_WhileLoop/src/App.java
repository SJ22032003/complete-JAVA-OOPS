import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("While Loop");
        
        try(Scanner sc = new Scanner(System.in)){
            int i = 1;
            while (i<=10) {
                System.out.println(i);
                i++;
            }
        }
    }
}
