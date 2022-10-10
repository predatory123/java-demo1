package PracticeJava;
/* 条件判断语句 */
public class Test02Demon {
    public static void main(String[] args){
        Garde(); //调用Grade方法
        Maxnumber(); //调用Maxnumber方法
    }
    public static void Garde(){
        int sorce = 0;
        if (sorce >= 90 && sorce <=100){
            System.out.println("成绩优秀，棒棒哒！");
        }else if(sorce >= 80 && sorce <90){
            System.out.println("成绩比较好，继续保持");
        }else if(sorce >= 70 && sorce < 80){
            System.out.println("成绩良好，还要努力哦");
        }else if(sorce >= 60 && sorce < 70){
            System.out.println("成绩及格，继续努力哦");
        }else {
            System.out.println("成绩不合格,继续努力哦");
        }
    }
    public static void Maxnumber(){
        int a = 10;
        int b = 15;
        int max;
        if(a > b){
            max = a;
        }else {
            max = b;
        }
        System.out.println("最大值：" + max);
    }
}
