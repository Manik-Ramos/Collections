import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        
        testMap("Hashmap",hashMap);
        testMap("Linked Hashmap",linkedHashMap);
        testMap("Tree Map",treeMap);
    }
    
    public static void testMap(String type,Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");
        
        System.out.println(type);
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
        System.out.println();
    }
    
}