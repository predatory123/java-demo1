package PracticeJava;

public class Test04Demon {
    public static void main(String[] args){
        //计算：从1到100之间所有奇数的和
        int k = 0;
        for(int i=1;i <=100;i++){
            if(i % 2 !=0){
               k += i;
//                System.out.println(k);
            }
        }
        System.out.println(k);
    }
}
