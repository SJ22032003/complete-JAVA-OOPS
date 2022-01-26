import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Linked List");
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(12);
            list.add(11);
            list.add(43);
            list.add(76);
            list.add(32);

            list.addLast(999); // adds element at the end of the list
            list.addFirst(63); // adds element at the beginning of the list
            list.getLast(); // returns the last element of the list
            list.getFirst(); // returns the first element of the list
            list.removeFirst(); // removes the first element of the list
            list.removeLast(); // removes the last element of the list
            list.pop(); // removes the last element of the list
            list.push(12); // adds element at the beginning of the list
            list.peek(); // returns the first element of the list
            list.poll(); // removes the first element of the list
            list.offer(12); // adds element at the end of the list
            list.toArray(); // returns an array containing all of the elements in this list in proper
                            // sequence

            for (Integer in : list) {
                System.out.println(in);
            }
        }
    }
}
