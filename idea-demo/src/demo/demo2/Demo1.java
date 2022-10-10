package demo.demo2;

import java.util.HashMap;
import java.util.Set;

/*
    HashMap遍历数据一
    map.keySet()
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("小米",3999.00);
        map.put("苹果",6999.00);
        map.put("华为",4999.00);
        // 通过keySet()拿到key的集合,然后通过key取出value
        Set<String> stringSet = map.keySet();
        for (String s : stringSet) {
            System.out.println(s + map.get(s));
        }
    }
}
