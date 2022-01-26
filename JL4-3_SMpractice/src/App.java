import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" Practice Set ");
        try(Scanner sc = new Scanner(System.in)){
            //1
            String name = sc.nextLine();
            System.out.println(name.toLowerCase());

            //2
            System.out.println(name.replace(" ","_"));
            System.out.println(name.replace("   "," "));

            //3
            System.out.printf("Dear %s , thanks a lot", name);

            //4
            System.out.println(name.indexOf("  "));
            System.out.println(name.indexOf("   "));

            //5
            System.out.println("Dear Shobhit,\n\tGreat Learnig\nThanks");
        }
    }
}
