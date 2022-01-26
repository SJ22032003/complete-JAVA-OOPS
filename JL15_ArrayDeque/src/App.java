import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array Deque");
        try(Scanner sc = new Scanner(System.in)){
         ArrayDeque<Integer> deque = new ArrayDeque<>();
         deque.add(2);   
         deque.add(11);   
         deque.add(44);   
         deque.add(2);   
         deque.add(3);

        deque.add(66); //add elements to the last of array
        deque.addFirst(77); //add elements to the first of array
        deque.addLast(88); //add elements to the last of array
        deque.offer(21); //add elements to the last of array
        deque.offerFirst(22); //add elements to the first of array
        deque.offerLast(23); //add elements to the last of array
        deque.push(24); //add elements to the last of array
        deque.pop(); //remove elements from the last of array
        deque.remove(); //remove elements from the last of array
        deque.removeFirst(); //remove elements from the first of array
        deque.removeLast(); //remove elements from the last of array
        deque.poll(); //remove elements from the last of array
        deque.getFirst(); //get elements from the first of array
        deque.getLast(); //get elements from the last of array

        
         for (Integer in : deque) {
             System.out.println(in);
         }   
        }
    }
}
