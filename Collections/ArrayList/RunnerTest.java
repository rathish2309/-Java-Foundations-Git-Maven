package Collections.ArrayList;
import java.util.ArrayList;
import java.util.ListIterator;

public class RunnerTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Eve");
        arrayList.add("Joseph");
        arrayList.add("Mary");

        ListIterator<String> stringListIterator =  arrayList.listIterator();

        System.out.println("Forward Direction");
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        System.out.println();

        System.out.println("Reverse Direction");
        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }
    }
}
