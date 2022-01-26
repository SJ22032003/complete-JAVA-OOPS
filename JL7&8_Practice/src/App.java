import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Practice Set");
        try(Scanner sc = new Scanner(System.in)){

            //1
                // for (int i = 4; i >= 1; i--) {
                //     for (int j = 0; j < i ; j++) {
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }

            //2
                // System.out.print("Enter no. = ");
                // int a = sc.nextInt();
                // int i = 0;
                // int sum = 0;
                // while(i<=a){
                //     sum += 2*i;
                //     i++;
                // }
                // System.out.println("total sum of even no = " + sum);

            //3
                // System.out.print("Enter which table you want = ");
                // int a = sc.nextInt();
                // for (int i = 1; i <= 10; i++) {
                //     System.out.println(a + "x" + i + "=" + (a*i));
                //     System.out.printf("%d x %d = %d\n", a , i , a*i);
                // }
            //4
                // System.out.print("Enter which table you want = ");
                // int a = sc.nextInt();
                // for (int i = 10; i >= 1; i--) {
                //     System.out.println(a + "x" + i + "=" + (a*i));
                //     System.out.printf("%d x %d = %d\n", a , i , a*i);
                // }
            //5
                // System.out.print("Enter which Factorial you want = ");
                // int a = sc.nextInt();
                // int fact = 1;
                // if(a!=0 && a<0){
                //     for (int i = 1; i <= a; i++) {
                //         fact *= i;
                //     }
                //     System.out.println("Factorial is = " + fact);
                // }else{
                //     System.out.println("Factorial is = 1");
                // }
            //6
                // System.out.print("Enter which table sum you want = ");
                // int a = sc.nextInt();
                // int sum = 0;
                // for (int i = 1; i < 10; i++) {
                //     sum += a*i;
                // }
                // System.out.println("table sum is = "+ sum);
        }
    }
}
