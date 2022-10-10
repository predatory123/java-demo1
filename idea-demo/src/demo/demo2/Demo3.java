package demo.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap遍历数据二
    map.forEach()
 */
public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("小米", 3999.00);
        map.put("苹果", 6999.00);
        map.put("华为", 4999.00);
        // 通过foreach遍历
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

    }
}
