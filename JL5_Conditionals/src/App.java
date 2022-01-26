import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int w = sc.nextInt();

            if(w%2==0 && w>2){
                System.out.println("YES");
            }else if(w==3){
                System.out.println("3");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
