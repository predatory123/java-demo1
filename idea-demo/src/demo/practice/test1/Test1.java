package demo.practice.test1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        TreeMap<String,TreeSet<String> > treeMap = new TreeMap<>();
        treeSet.add("电子工业出版社");
        treeSet.add("异步图书");
        treeSet.add("清华大学出版社");
        treeMap.put("品牌",treeSet);

//        treeSet.forEach(s -> System.out.println(s));

//        treeMap.forEach((k,v) -> System.out.println(k + ": " + v));

        treeMap.forEach((k,v) -> {
            System.out.print(k + ": ");
            v.forEach(s -> System.out.print(s+ " "));
        });

//        Set<Map.Entry<String, TreeSet<String>>> entries = treeMap.entrySet();
//        for (Map.Entry<String, TreeSet<String>> entry : entries) {
//            System.out.println(entry);
//
//        }


    }
}
