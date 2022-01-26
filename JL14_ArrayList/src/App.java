import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ArrayList");
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(6); // can add index to specific position
            li.add(5);
            li.add(7);
            li.add(6);
            li.add(1);

            ArrayList<Integer> li2 = new ArrayList<>();
            li2.add(10);
            li2.add(99);
            li2.add(89);
            li2.add(76);
            li2.add(33);
            li2.add(48);

            li.addAll(2,li2); // add all elements from li2 to li and also with spicific index
            li.add(5,li.get(5));

            for (int i = 0; i < li.size(); i++) {
                System.out.println(li.get(i));
            }

            // li.clear(); // clear all elements
            // for (Integer in : li) {
            //     System.out.println(in);
            // }

            System.out.println(li2.contains(69)); // check if list contains specific element

            System.out.println(li.indexOf(6)); // return index of specific element

            System.out.println(li.lastIndexOf(6)); // return last index of specific element

            System.out.println(li.isEmpty()); // check if list is empty

            System.out.println(li.remove(0)); // remove element from specific index

            System.out.println(li.remove(li.indexOf(6))); // remove element from specific index

            System.out.println(li.removeAll(li2)); // remove all elements from specific list

            System.out.println(li.subList(0,3)); // return sublist from specific index

            System.out.println(li.set(5,999)); // set specific index to specific value
            
            li.toArray(); // convert list to array
        }
    }
}
