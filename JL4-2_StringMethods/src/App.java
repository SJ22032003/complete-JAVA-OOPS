import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("String Methods");

        try(Scanner sc = new Scanner(System.in)){

            //Length-------------------
            System.out.print("Enter your name = ");
            String name = sc.nextLine();
            int len = name.length();
                System.out.println(len);
            // to uppercase------------
            System.out.println(name.toUpperCase());
            // to lowercase------------
            System.out.println(name.toLowerCase());
            // trim--------------------
            System.out.println(name.trim());
            // substring--------------
            System.out.println(name.substring(4)); // it takes INDEX
            System.out.println(name.substring(4,7)); // it takes INDEX and end INDEX
            // replace---------------
            System.out.println(name.replace('o', '$'));
            System.out.println(name.replace("jaryal", "jaswal"));
            //starts with & endswith
            System.out.println(name.startsWith("sho"));
            System.out.println(name.endsWith("tt"));
            // Char at
            System.out.println(name.charAt(5));
            // Indexof  // if not found, it returns -1
            System.out.println(name.indexOf("b"));
            System.out.println(name.indexOf("t" , 5)); // starts from given index
            // last Indexof-----------------
            System.out.println(name.lastIndexOf("r"));
            System.out.println(name.lastIndexOf("r" , 5));
            //equals
            String test = "Shobhit";
            System.out.println(name.equals(test)); // case sensitive
            System.out.println(name.equalsIgnoreCase(test));

        }
        
    }
}
