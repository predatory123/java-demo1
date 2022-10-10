package PracticeJava;
/* 方法重载
    1.比较两个数据是否相等（两个byte，两个int，两个long）
    2.判断哪些方法是正常重载
    3.实现重载的pri
 */
public class Test06Demon {
    public static void main(String[] args) {
        printValue("你好");      //方法重载基本演示
        System.out.println(isSame((byte)11,(byte)11));
        System.out.println(isSame((short) 111,(short) 111));
        System.out.println(isSame(111,1111));
        System.out.println(isSame(111L,1111L));
    }
    public static void printValue(byte sum){
        System.out.println(sum);
    }
    public static void printValue(short sum){
        System.out.println(sum);
    }
    public static void printValue(int sum){
        System.out.println(sum);
    }
    public static void printValue(long sum){
        System.out.println(sum);
    }
    public static void printValue(float sum){
        System.out.println(sum);
    }
    public static void printValue(double sum){
        System.out.println(sum);
    }
    public static void printValue(char zifu){
        System.out.println(zifu);
    }
    public static void printValue(boolean is){
        System.out.println(is);
    }
    public static void printValue(String str){
        System.out.println(str);
    }

    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte类型");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("两个short类型");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("两个int类型");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(long a,long b){
        System.out.println("两个long类型");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static void open(){}
    public static void open(int a){}
//    static void open(int a, int b){}   //无效重载
//    public static void open(int a,double b){}   //无效重载
    public static void open(double a,int b){}
//    public void open(int i,double b){}  //无效重载
    public static void OPEN(){}
//    public static void open(int i,int j){}  //无效重载

}
