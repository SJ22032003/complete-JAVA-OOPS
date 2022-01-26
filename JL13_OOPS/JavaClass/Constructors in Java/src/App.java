import java.util.*;

class MyEmployee{
    private int id;
    private String name;

    //constructor : these can be Overloaded
    public MyEmployee(String myName , int myId){
        id = myId;
        name = myName;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }
    public int getId() {
        return id;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Constructors");
        try (Scanner sc = new Scanner(System.in)) {
            MyEmployee emp1 = new MyEmployee("Admin",22);

            // emp1.setName("Shobhit Jaryal");
            // emp1.setId(22);

            System.out.println(emp1.getId());
            System.out.println(emp1.getName());

        }
    }
}
