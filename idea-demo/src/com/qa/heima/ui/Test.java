package com.qa.heima.ui;

import com.qa.heima.controller.StudentController;
import com.qa.heima.pojo.Student;

import java.util.Scanner;

public class Test {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        loop:
        while (true) {
            System.out.println("=============欢迎来到学生管理系统==============");
            System.out.println("[1]添加学生");
            System.out.println("[2]修改学生");
            System.out.println("[3]查看学生");
            System.out.println("[4]删除学生");
            System.out.println("[5]按照学号查询");
            System.out.println("[6]退出系统");
            System.out.println("请选择你的操作(输入1~6整数)");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("----添加学生----");
                    Student student = getNewStudent();
                    studentController.add(student);
                    break;
                case 2:
                    System.out.println("----修改学生----");
                    Student updateStu = updateStudent();
                    studentController.update(updateStu);
                    break;
                case 3:
                    System.out.println("----查看学生----");
                    studentController.findAll();
                    break;
                case 4:
                    System.out.println("----删除学生----");
                    System.out.println("请输入学号: ");
                    String delStuID = sc.next();
                    studentController.delete(delStuID);
                    break;
                case 5:
                    System.out.println("----按照学号查询----");
                    System.out.println("请输入学号: ");
                    String findOneByStuID = sc.next();
                    studentController.findById(findOneByStuID);
                    break;
                case 6:
                    System.out.println("----感谢你的使用----!");
                    break loop;
                default:
                    System.out.println("输入错误,请重试!");
            }
        }
    }

    private static Student updateStudent() {
        System.out.println("请输入学号: ");
        String updateStuID = sc.next();
        System.out.println("请输入学生姓名:");
        String updateName = sc.next();
        System.out.println("请输入学生年龄:");
        int updateAge = sc.nextInt();
        System.out.println("请输入学生生日:");
        String updateBirthday = sc.next();
        return new Student(updateStuID,updateName,updateAge,updateBirthday);
    }

    private static Student getNewStudent() {
        System.out.println("请输入学号: ");
        String stuID = sc.next();
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();
        Student student = new Student(stuID,name,age,birthday);
        return student;
    }
}
