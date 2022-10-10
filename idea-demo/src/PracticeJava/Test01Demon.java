package PracticeJava;
// 算术运算符
public class Test01Demon {
    public static void main(String[] args){
        Suanshu();
        Sanyuan();
    }
    public static void Suanshu(){       // 基本运算，四则运算
        int a = 15;
        int b = 4;
        System.out.println( a + b);  //加法
        System.out.println(a - b);  //减法
        System.out.println(a * b);  //乘法
        System.out.println(a / b);  //除法
        System.out.println(a % b);  //取余数----取模
    }
    public static void Sanyuan(){       //三元运算
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;  // 如果a>b成立，则取a的值，反之取b的值
        System.out.println(max);
    }
}

