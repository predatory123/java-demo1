package com.qa.heima.service;

import com.qa.heima.dao.StudentDao;
import com.qa.heima.pojo.Student;

import java.util.ArrayList;

public class StudentService {

    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        if (student == null){
            System.out.println("添加失败");
        }
        int index = studentDao.getIndex(student.getStuId());
        if (index == -1){
            studentDao.addStudent(student);
            System.out.println("添加成功");
        }else {
            System.out.println("学号已存在");
        }

    }

    public void findAllStudent() {
        ArrayList<Student> list = studentDao.findAllStudent();
        System.out.println("学号" + "\t\t" + "姓名" + "\t" + "年龄" + "\t" + "生日");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getStuId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    public void findStudentById(String stuID) {
        int index = studentDao.getIndex(stuID);
        if (index == -1){
            System.out.println("学号不存在!");
        }
        Student stu = studentDao.findStudentById(stuID);
        System.out.println("学号" + "\t\t" + "姓名" + "\t" + "年龄" + "\t" + "生日");
        System.out.println(stu.getStuId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
    }

    public void updateStudent(Student student) {
        int index = studentDao.getIndex(student.getStuId());
        if (index == -1){
            System.out.println("学号不存在!");
        }
        studentDao.updateStudent(student,index);
        System.out.println("修改成功");
    }

    public void deleteStudent(String stuId) {
        int index = studentDao.getIndex(stuId);
        if (index == -1){
            System.out.println("学号不存在!");
        }
        studentDao.deleteStudent(stuId);
        System.out.println("删除成功");
    }
}
