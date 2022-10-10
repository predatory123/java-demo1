package xuexiaoxiao.demonstring;
/* 字符串比较，得到一个布尔值
        equals 比较是否相等
        startsWith 比较前缀
        endsWith 比较后缀
        regionMaches 比较是否含有相同部分
 */
public class Demon03Test {
    public static void main(String[] args) {
        String bob = "tom";
        String pop = "jake";
        System.out.println(bob.equals(pop));  //所有字符串比较

        System.out.println("Urinstinkt" .endsWith("instinkt")); //字符串结尾部分比较,

        System.out.println("interesting" .startsWith("interesting")); //字符串开始部分比较

        System.out.println("aliceaaabbb".regionMatches(5,"hahahaaaabbb",6,6));
        //  第一个参数为：目标字符串的开始位置
        //  第二个参数为：参与比较的字符串
        //  第三个参数为：参与比较的字符串的起始位置
        //  第四个参数为：参与比较的字符串的字符个数


    }
}
