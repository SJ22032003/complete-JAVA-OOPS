import java.util.Scanner;

class Square{
    int side;
        public int area(){
            return side*side; 
        }
        public int perimeter(){
            return 4*side;
        }
}

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            Square sq = new Square();
            System.out.print("Enter you Square Side = ");
            sq.side = sc.nextInt();
            
            System.out.printf("Area of Square is %d sq units.", sq.area());
            System.out.println();
            System.out.printf("Perimeter of Square is %d units.", sq.perimeter());
        }
    }
}
