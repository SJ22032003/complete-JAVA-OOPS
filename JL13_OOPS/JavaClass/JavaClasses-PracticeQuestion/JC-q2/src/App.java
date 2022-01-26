import java.util.Scanner;

class Cellphone {
    public void ring() {
        System.out.println("ringing....");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Cellphone cell = new Cellphone();
            cell.vibrate();
            cell.ring();
        }
    }
}
