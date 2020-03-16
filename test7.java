package Test;

import java.util.HashMap;
import java.util.Map;

public class test7 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        Map<String, String> map2 = new HashMap<>();
        map2.put("d", "d");
        map2.put("e", "e");
        map2.put("f", "f");
        map.containsKey("a");
        System.out.println(map2.get("f"));
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("key:" + m.getKey() + " value:" + m.getValue());
        }
    }
}
