package intermidiateJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapSetDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> score = new HashMap<>();

        mapUtil(score);

    }

    public static void mapUtil(Map<Integer, String> map){
        map.put(1, "Gadhi");
        map.put(2, "Arjun");
        map.put(3, "Ishan");
        map.put(4, "Gadhi");

        for (int key: map.keySet()){
            System.out.println("Key: " + key + " value "  + map.get(key));
        }
        System.out.println(map);
        System.out.println(map.keySet());
    }
}
