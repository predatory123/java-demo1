package study_test;
/** JAVA 实例变量 */
import java.io.*;
public class Employee {
    //这个成员变量对子类可见
    public String name;

    //私有变量，仅在该类可见
    public double salary;

    //在构造器中对name赋值
    public Employee(String empname){
        name = empname;
    }

    //设定salary的值
    public void setsalary(double empsal){
        salary = empsal;
    }

    //打印信息
    public void printEmp(){
        System.out.println("name:" + name);
        System.out.println("salary:" + salary);
    }

    public static void main(String args[]){
        Employee empOne = new Employee("Ransike");
        empOne.setsalary(1000);
        empOne.printEmp();
    }
}
