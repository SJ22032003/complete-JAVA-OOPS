import java.util.Scanner;
public class App {

    //Methods-----------
    
    //1 Static Method
    static int logic(int x , int y){
        int z;
        if (x>y) {
            z = x+y;
        } else {
            z = (x+y) * 5;
        }
        return z;
    }
    
    //2 Object Method
    //another program

    //3 void
    static void tellJoke() { // void , when return data with no type 
        System.out.println("Haha Joke");
    }
    //4 Array reffrence
    static void arrayChange(int[] arr){
        arr[0] = 11;
    }

    //Main--------------
    public static void main(String[] args) throws Exception {
        System.out.println("Java Methods");

        methodObj obj = new methodObj();

        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt(), b = sc.nextInt() , c ;

            System.out.println(logic(a, b)); // Static Method
            //------------------    
            c = obj.objLogic(a,b); // Object Calling Method
            System.out.println(c);
            //--------------------
            tellJoke();
            //--------------------
            int[] marks = {94,50,30,41,43,100};
            arrayChange(marks);
            System.out.println(marks[0]);
        }
    }
}
 