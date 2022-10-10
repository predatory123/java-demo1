package xuexiaoxiao.demonstring;
/*字符串的查找和替换
*   indexof
* */
public class Demon05Test {
    public static void main(String[] args) {
        /*一个参数时*/
        System.out.println("haseki".indexOf("e"));   //指出字符在字符串中出现的位置
        System.out.println("haseki".indexOf("ki"));   //指出字符在字符串中出现的位置
        /*字符串后面加一个数字参数，代表从此参数的位置开始查找*/
        System.out.println("haneppyness".indexOf("ne",3));

        System.out.println("haneppyness".lastIndexOf("ne",3));  //从字符串的最右边开始查找，即倒序排列

        System.out.println("steancsgorushb".contains("rushb")); //查找字符串中是否包含目标字符

        System.out.println("steancsgorushb".replace("rushb","gogogo")); //查找字符并替换

        System.out.println("steamrushbcsgorushb".replaceFirst("rushb","gogogo")); //查找字符并替换第一个匹配对象

        System.out.println("steamrushbcsgorushb".replaceAll("rushb","gogogo")); //查找字符并替换所有匹配对象


    }
}
