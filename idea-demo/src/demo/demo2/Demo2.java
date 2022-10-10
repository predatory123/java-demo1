package demo.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap遍历数据二
    maps.entrySet();
 */
public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Double> maps = new HashMap<>();
        maps.put("小米", 3999.00);
        maps.put("苹果", 6999.00);
        maps.put("华为", 4999.00);
        // entry()拿到key的集合,然后通过key取出value
        Set<Map.Entry<String, Double>> entries = maps.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + "\n" + entry.getValue());
        }

    }
}
