package xuexiaoxiao.demonstring;

import java.lang.reflect.Array;
import java.util.Arrays;

/*字符串拆分*/
public class Demon02Test {
    public static void main(String[] args) {
        String zto = "abcdegfkkdgdldefdgdvdjjj";
        System.out.println(zto.substring(5));   //在指定的位置拆分
        System.out.println(zto.substring(5, 8));   //在指定的区间拆分

        /*split方法返回一个字符串*/
        String[] zto56 = zto.split("d");    //按d来拆分，拆分后不显示d
        System.out.println(Arrays.toString(zto56));    //把字符串数组转化为字符串
    }
}
