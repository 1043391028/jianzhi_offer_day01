package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zhang", "31");//存放键值对

        System.out.println(map.containsKey("zhang"));//键中是否包含这个数据
        System.out.println(map.containsKey("daniu"));
        System.out.println("=========================");

        System.out.println(map.get("zhang"));//通过键拿值
        System.out.println(map.get("daniu"));
        System.out.println("=========================");

        map.put("cheng", "32");
        map.put("yun", "33");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("=========================");

        map.clear();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "1");
        map.put("E", "2");
        map.put("F", "3");
        map.put("G", "1");
        map.put("H", "2");
        map.put("I", "3");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }

    }
}
