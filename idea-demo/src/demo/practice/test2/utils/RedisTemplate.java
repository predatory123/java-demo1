package demo.practice.test2.utils;

import demo.practice.test2.inter.HashOperations;
import demo.practice.test2.inter.ValueOperations;
import demo.practice.test2.inter.impl.DefaultHashOperations;
import demo.practice.test2.inter.impl.DefaultValueOperations;

// 缓存工具类
public class RedisTemplate {

    // 操作值为String类型缓存工具类
    private final ValueOperations valueOperations = new DefaultValueOperations() ;

    // 操作值为HashMap类型缓存工具类
    private final HashOperations hashOperations = new DefaultHashOperations() ;

    // 获取操作值为String类型缓存工具类对象
    public ValueOperations opsForValue() {
        return valueOperations ;
    }

    // 获取操作值为HashMap类型缓存工具类
    public HashOperations opsForHash() {
        return hashOperations ;
    }

}
