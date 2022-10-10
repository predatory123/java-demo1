package demo.demo2;

import java.util.HashMap;
import java.util.Map;

/*
    hashmap 去重示例
    在对象中重写equals 和 hashcode 方法
 */
public class Demo5 {
    public static void main(String[] args) {
        HashMap<Goods, Integer> map = new HashMap<>();
        map.put(new Goods("奥迪",300000),10);
        map.put(new Goods("奥迪",300000),10);
        map.put(new Goods("奔驰",450000),10);
        map.put(new Goods("宝马",360000),3);
        System.out.println(map);
//        System.out.println("==========================");
//        map.forEach((k,v) -> {
//            System.out.println(k.getName() + " " + v);
//        });
//        System.out.println("==========================");
//        for(Map.Entry<Goods,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey().getName() + " " + entry.getValue());
//        }

    }
}
