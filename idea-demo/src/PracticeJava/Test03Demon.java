package PracticeJava;
/*
如果在case中有break，将按照正常顺序执行
如果没有，则产生穿刺效果，连续执行，直到遇到break或程序结束为止
*/
public class Test03Demon {
    public static void main(String[] args){
        int sum = 3;
        switch (sum){
            case 1:
                System.out.println("我好");
                break;
            case 2:
                System.out.println("你好");
                break;
            case 3:
                System.out.println("她好");
//                break;
            default:
                System.out.println("大家好");
                break;
        }
    }
}
