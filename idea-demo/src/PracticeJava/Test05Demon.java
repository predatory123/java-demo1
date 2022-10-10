package PracticeJava;
/*方法练习
    1.比较两个数字的大小
    2.求出1到100之间所有的和
    3.打印制定次数的Hello World
 */
public class Test05Demon {
    public static void main(String[] args) {
        System.out.println(compare(3,5));
        System.out.println(compare1(5,5));
        System.out.println(compare2(5,7));
        System.out.println(compare2(9,9));
        System.out.println(valueSum());
        printValue(3);
    }
    // 第一种
    public static boolean compare(int a, int b){
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }
    //第二种
    public static boolean compare1(int a, int b){
        boolean same;
        same = a == b ? true : false;
        return same;
    }
    //第三种
    public static boolean compare2(int a, int b){
        boolean same = a == b;
        return same;
    }
    //第四种
    public static boolean compare3(int a, int b){
        return a == b;
    }

    public static int valueSum(){
        int a = 0;
        for(int b = 1;b <=100;b++ ){
            a += b;
        }
        return a;
    }

    public static void printValue(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World" + (i + 1));
        }
    }
}
