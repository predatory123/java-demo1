package demo.demo3;

import java.util.TreeMap;


public class Demo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"张三");
        map.put(8,"老王");
        map.put(20,"小米");

        map.forEach((k,v) -> System.out.println(k + " " + v));

    }
}
