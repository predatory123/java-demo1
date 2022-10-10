package study_test;
/** JAVA 局部变量 */
public class Pummy{
    public void puAge(){
        int age = 0;
        age = age + 15;
        System.out.println("Pummy age is: " + age);
    }
    public static void main(String args[]){
        Pummy test = new Pummy();
        test.puAge();
    }
}
