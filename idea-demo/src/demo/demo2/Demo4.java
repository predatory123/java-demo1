package demo.demo2;

import java.util.HashMap;
import java.util.Map;

/*
    hashmap 存储集合对象示例
 */
public class Demo4 {
    public static void main(String[] args) {
        HashMap<Goods, Integer> map = new HashMap<>();
        map.put(new Goods("奥迪",300000),10);
        map.put(new Goods("奔驰",450000),5);
        map.put(new Goods("宝马",360000),3);
        System.out.println(map);
        System.out.println("==========================");
        map.forEach((k,v) -> {
            System.out.println(k.getName() + " " + v);
        });
        System.out.println("==========================");
        for(Map.Entry<Goods,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey().getName() + " " + entry.getValue());
        }

    }
}
