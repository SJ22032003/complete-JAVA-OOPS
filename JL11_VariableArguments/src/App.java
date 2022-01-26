import java.util.Scanner;
public class App {
    static int sum(int x , int ...args){
        int result = x;
        for (int i : args) {
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Variable Arguments (VarArgs)");
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Sum of your input is = "+ sum(1,2));
            
        }
    }
}
