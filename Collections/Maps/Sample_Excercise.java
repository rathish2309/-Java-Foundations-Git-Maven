package Collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sample_Excercise {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // 1. put(key, value) — Add a key-value pair
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 2. get(key) — Get value by key
        System.out.println(map.get(1)); //-> Apple

        // 3. containsKey(key) — Check if a key exists
        System.out.println(map.containsKey(2)); //true

        // 4. containsValue(value) — Check if a value exists
        System.out.println(map.containsValue("Orange"));//false

        // 5. remove(key) — Remove key-value by key
        map.remove(3);
        System.out.println(map);

        // 6. size() — Number of entries
        System.out.println(map.size());

        // 7. isEmpty() — Check if map is empty
        System.out.println(map.isEmpty());

        // 8. keySet() — Get all keys
        System.out.println(map.keySet());

        // 9. values() — Get all values
        System.out.println(map.values());

        // 10. entrySet() — Get all key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //entrySet() — Get all key-value pairs - using lambda
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        // 11. putIfAbsent(key, value) — Add only if key doesn't exist
        map.putIfAbsent(2, "Blueberry"); // Won’t replace
        map.putIfAbsent(3, "Date"); // Will add
        System.out.println(map); // Output: {2=Banana, 3=Cherry, 4=Date}

        // 12. replace(key, newValue) — Replace value for existing key
        map.replace(3, "Coconut");
        System.out.println(map); // Output: {2=Banana, 3=Coconut, 4=Date}

        //13. Clear the map
//        map.clear();
//        System.out.println(map); // Output: {}

        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        System.out.println("PUT ALL");
        System.out.println(treeMap);
    }
}
