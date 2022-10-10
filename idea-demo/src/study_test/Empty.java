package study_test;
/** Java 类变量（静态变量）  */
public class Empty {
    //salary是静态的私有变量
    private static double salary;

    //DEPARKMENT是一个常量
    public static final String DEPARKMENT = "Develpoment";
    public static void main(String args[]){
        salary = 88888;
        System.out.println(DEPARKMENT + "average salary: " + salary);
    }
}


