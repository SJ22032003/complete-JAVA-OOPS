import java.util.Scanner;
public class App {
    //Methods

    //1
    static int sum(int n){
       if(n==1){
        return 1;
       }
       return n+sum(n-1);
    }

    //2
    static int power(int a ,int b){
        if(b==0){
            return 1;
        }
        return a*power(a, b-1);
    }

    //3
    static int fib(int x){
        if(x==1 || x==2){return x-1;}
        return fib(x-1)+fib(x-2);
    }

    //4
    static int avg(int ...arr){
        int temp = 0 , a = 0 ; 
        for (int i : arr) {
            temp += i; a++;
        }
        return temp/a;
    }

    //5
    static void starPattern(int n){
        if(n>0){
            starPattern(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //6
    static void revStar(int n){
        if(n > 0){
            for (int i = n; i > 0 ; i--) {
                System.out.print("*");
            }
            System.out.println();
            revStar(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Recursion");
        try(Scanner sc = new Scanner(System.in)){

            //1 Find the sum of first N natural number
                // System.out.print("Enter No. you want Sum upto = ");
                // int n = sc.nextInt();
                // System.out.println(sum(n));

            //2 Find power using Recursion a^b
            // System.out.print("Enter base number = ");
            // int a = sc.nextInt();
            // System.out.print("Enter the power = ");
            // int b = sc.nextInt();
            // System.out.print(power(a,b));

            //3 fibonnaci series
            // int n = sc.nextInt();
            // System.out.println(fib(n));
            
            //4
            // System.out.println(avg(4,4,4,4));

            //5 star pattern with Recursion
            // starPattern(4);

            //6 reverse star pattern
            // revStar(4);
        }
    }
}
