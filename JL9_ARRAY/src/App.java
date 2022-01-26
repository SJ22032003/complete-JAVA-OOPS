import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array \n");
        try(Scanner sc = new Scanner(System.in)){
            int a = 5;
            int [] table = new int [10];
            for (int i = 0; i < table.length; i++) {
                table[i] = a*(i+1);
            }
            for (int j = 0; j <= table.length - 1 ; j++) {
                System.out.println(table[j]);
            }
            
        }
    }
}
