import java.util.Scanner;

public class App {
    
    // Method Overloading of foo
    // static int logic(int a,int b,int c){
    //     int w = a+b+c;
    //     return w;
    // }
    static void foo(){
        System.out.println("Good Morning Bro");
    }
    static void foo( int a ){
        System.out.println("Good Morning " + a + " Bro");
    }
    static void foo(String x , String y){
        System.out.printf("Good Moring %s. What are doing ? How is your friends %s?\n", x , y);
    }
    static int foo( int a , int b , int c){
        // System.out.println(logic(a,b,c));
        int z = a+b+c;
        return z;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {

            foo();      //without argument
            foo(420);   // with argument
            foo("Shobhit", "Shaurya"); // with different parameters
            System.out.println(foo(5,10,20));
        }
    }
}
