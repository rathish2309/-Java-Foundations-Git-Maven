package Collections.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class RunnerTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Adam");
        linkedList.add("Eve");
        linkedList.add("Joseph");
        linkedList.add("Mary");
//        System.out.println(linkedList);

        System.out.println();

        //Using 'for loop', traverse through the array and print the names to the console.
        System.out.println("Using For Loop - after removing first and last element");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("--------------------------------");

        //Remove the first and the last element and print the list using 'advanced for loop'.
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Remove the first and the last element and print the list using 'advanced for loop'");
        for (String s : linkedList){
            System.out.println(s);
        }

        System.out.println("--------------------------------");

        //Add new names at the first and last position and print the list using an iterator.
        System.out.println("Add new names at the first and last position and print the list using an iterator");
        linkedList.addFirst("Xavier");
        linkedList.addLast("Mathews");

        Iterator<String> iterator  = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
