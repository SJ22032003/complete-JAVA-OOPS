import java.util.Scanner;

class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemey");
    }
    public void run(){
        System.out.println("Runnig...");
    }
    public void fire(){
        System.out.println("Firing at enemey");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            Tommy tom = new Tommy();
            tom.hit();
            tom.run();
            tom.fire();
        }
    }
}
