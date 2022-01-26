import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

    // Access Modifiers

    public void setName(String n){ // SETTERS
        this.name = n;
    }
    public String getName(){  // GETTERS
        return name;
    }

    public void setId(int i){
        if(i == 22){
            id = 10;
        }else{
            id = i;
        }
    }
    public int getId() {
        return id;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Access Modifiers ---");
        try (Scanner sc = new Scanner(System.in)){
            MyEmployee emp1 = new MyEmployee();
            MyEmployee emp2 = new MyEmployee();
            // emp1.id = 22;
            // emp1.name = "Shobhit"; // Throws error due to private Access Modifier 

            emp1.setName("Shobhit Jaryal");
            emp1.setId(24);
            System.out.println(emp1.getName());
            System.out.println(emp1.getId());

            emp2.setName("Sahil Jaryal");
            emp2.setId(22);
            System.out.println(emp2.getName());
            System.out.println(emp2.getId());
        }
    }
}
