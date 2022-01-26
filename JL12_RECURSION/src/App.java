import java.util.Scanner;

public class App {
    
    //functions
    static int fact(int x){
        if(x==1|| x==0){
            return 1;
        }
        return x*fact(x-1);
    }
    static void fibo(int x){
        if(x >= 1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fibo(x-1);
        }
    }
    static int a = 0 , b = 1 , c ;

    //Main-----------------------------------------------------------
    public static void main(String[] args) throws Exception {
        System.out.println("Recusion");
        
        try (Scanner sc = new Scanner(System.in)){
            //factorial
            System.out.print("Enter No. for factorial = ");
            int f  = sc.nextInt();
            System.out.println(fact(f));

            //fibonacci Series
            System.out.print("Enter length of fibonacci Series : ");
            int fib = sc.nextInt();
            System.out.print(a+" "+b);
            fibo(fib);
        }
    }
}
