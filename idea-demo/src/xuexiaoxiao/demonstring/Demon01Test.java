package xuexiaoxiao.demonstring;
/*字符串遍历*/
public class Demon01Test {
    public static void main(String[] args) {
        String name = "TayloySwift";
        System.out.println(name.charAt(5));    //访问字符串中的字符
        //当使用name.length时，用charAt访问字符串中的字符需要减1，负责报‘字符下标越界’错误
//        System.out.println(name.charAt(name.length()));
        System.out.println(name.charAt(name.length() -1 ));
    }
}
