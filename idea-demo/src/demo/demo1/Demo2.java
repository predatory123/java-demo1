package demo.demo1;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // map.put(key,value)  赋值
        map.put("张三",20);
        map.put("杨永信",18);
        map.put("王劲泽",15);
        // map.get(key)  获取值,不存在的key取值的value即为null
        System.out.println(map.get(1));
        System.out.println(map.get("张三"));


        System.out.println(map);
        // 通过key删除一组键值对
        System.out.println(map.remove("张三"));
        // 查找是否包含该key
        System.out.println(map.containsKey("张三"));
        // 查找是否包含该value
        System.out.println(map.containsValue(20));
        // 判断集合是否为空
        HashMap<Object, Object> map1 = new HashMap<>();
        System.out.println(map1.isEmpty());
        // 判断集合的长度
        System.out.println(map.size());
    }
}
