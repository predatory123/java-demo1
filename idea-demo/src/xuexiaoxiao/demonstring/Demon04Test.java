package xuexiaoxiao.demonstring;
/*练习：
*   编写一个程序，比较两个字符串是否有共用的最长后缀
* */
public class Demon04Test {
    public static void main(String[] args) {
       String s1 = "Tischlerel";
       String s2 = "Fischerel";
       String compareTest = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            String teilStr = s1.substring(i);
            if(s2.endsWith(teilStr)){
                compareTest = teilStr;
            }else {
                break;
            }
        }
        System.out.println(compareTest);
    }
}
