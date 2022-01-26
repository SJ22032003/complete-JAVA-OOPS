import java.util.Scanner;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name; 
    }
    public void setName(String n){
        name = n;
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Practice Set");
        try(Scanner sc = new Scanner(System.in)){
            Employee emp1 = new Employee();
            Employee emp2 = new Employee();

            //Setting Attributes-----------

                //Employee - 1
                System.out.print("Enter name = ");
                    emp1.name = sc.nextLine();
                System.out.print("Enter salary = ");
                    emp1.salary = Integer.parseInt(sc.nextLine());
                //Employee - 2
                System.out.print("Enter name = ");
                    emp2.name = sc.nextLine();
                System.out.print("Enter salary = ");
                    emp2.salary = Integer.parseInt(sc.nextLine());

            //Printing Atributes------------
            System.out.println(emp1.getName());
            System.out.println(emp1.getSalary());

            System.out.println(emp2.getName());
            System.out.println(emp2.getSalary());
        }
    }
}
