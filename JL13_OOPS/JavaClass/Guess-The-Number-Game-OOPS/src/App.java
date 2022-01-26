import java.util.*;

class ComputerGuess{
    private int g;
    public ComputerGuess(){
        int num = (int) (Math.random() * (10 - 1 + 1) + 1);
    }
    static void setter(int n){
        g = n ;
    }
    static void getter(){
        System.out.println();
    }


}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Play guess the number ----");
        System.out.println("lower the score you win");
        try(Scanner sc = new Scanner(System.in)){
            ComputerGuess cg = new ComputerGuess();
            System.out.println("Numbers are between 1 to 10");
            System.out.println("Input you guess = ");
            int guess = sc.nextInt();

        }
    }
}
