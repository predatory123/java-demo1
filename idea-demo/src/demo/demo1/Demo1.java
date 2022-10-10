package demo.demo1;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // map.put(key,value)  赋值
        map.put("张三","法外狂徒");
        map.put("杨永信","雷电法王");
        map.put("王劲泽","真香定律");
        // map.get(key)  获取值,不存在的key取值的value即为null
        System.out.println(map.get(1));
        System.out.println(map.get("张三"));


        System.out.println(map);
    }
}
