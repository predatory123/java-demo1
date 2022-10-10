package demo.demo3;

import java.util.TreeMap;

public class Demo2 {
    public static void main(String[] args) {
        TreeMap<Dog, Double> map = new TreeMap<>();
        map.put(new Dog("tom", 5), 2000.0);
        map.put(new Dog("bob", 10), 3025.0);
        map.put(new Dog("alice", 2), 5600.0);

        map.forEach((k, v) -> System.out.println(k.getName() + " " + k.getAge() + " " + v));
    }
}
