package study_test;

public class NumberTest {
    public static void main(String args[]){
        int a =10;
        int b =20;
        int c =30;
        int d =40;
        System.out.println("a+b = "+ (a+b));
        System.out.println("a-b = "+ (a-b));
        System.out.println("a*b = "+ (a*b));
        System.out.println("a/b = "+ (a/b));
        System.out.println("a++ = "+ (a++));   //a=a+1   但此时取a的值10
//        System.out.println("c/a = "+ (c/a));
        System.out.println("a-- = "+ (a--));    // a= a-1  但此时取上一个a的值11
        System.out.println("a++ = "+ (a++));    // a= a+1    此时取上一个a的值10
        System.out.println("++a = "+ (++a));    // a= a+1    此时取上一个a的值10
    }
}
