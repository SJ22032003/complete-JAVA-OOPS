import java.util.Scanner;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My name is = "+ name);
        System.out.println("My ID is = "+ id);
    }
    public int getSalary(){
        return salary;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Custom Java Classes\n");
        try(Scanner sc = new Scanner(System.in)){
            Employee shobhit = new Employee(); // Instantiating a new Employee OBJECT
            Employee sarthak = new Employee();
            //Setting the Attributes
                shobhit.id = sc.nextInt();
                shobhit.name = sc.nextLine();
                shobhit.salary = sc.nextInt();

                sarthak.id = 23;
                sarthak.name = " Sarthak";
                sarthak.salary = 15000;
            //-------------------------
            //Printing attributes
                // System.out.println(shobhit.id);
                // System.out.println(shobhit.name);

                // we can also use Methods inside our Classes
                    shobhit.printDetails();
                    System.out.println("Your salary is "+ shobhit.getSalary());

                    sarthak.printDetails();
                    System.out.println("Your salary is "+ sarthak.getSalary());
        }
    }
}
