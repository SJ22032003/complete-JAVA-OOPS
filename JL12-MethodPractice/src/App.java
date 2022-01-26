import java.util.Scanner;
public class App {
    static void table(int x){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", x , i , x*i);
        }
    }
    static void star(String x, int y){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
    static int sum(int x){
        if(x == 1){return 1;}else if(x == 0){return 0;}
        else{
            return x+sum(x-1);
        }
    }
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){

            //1
                // int input = sc.nextInt();
                // table(input);
            
            //2
                System.out.print("enter the pattern you want = ");
                String patt = sc.next();
                System.out.print("enter number of rows = ");
                int rows = sc.nextInt();
                star(patt , rows);
            
            //3
                // System.out.print("enter the sum upto = ");
                // int nat = sc.nextInt();
                // System.out.println(sum(nat));
        }
    }
}
