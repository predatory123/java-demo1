package com.qa.heima.dao;

import com.qa.heima.pojo.Student;

import java.util.ArrayList;

public class StudentDao {
    ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student student) {
        list.add(student);
    }

    public ArrayList<Student> findAllStudent() {
        return list;
    }

    public int getIndex(String stuId) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stuId.equals(stu.getStuId())) {
                index = i;
                break;
            }
        }
        return index;
    }


    public Student findStudentById(String stuID) {
        Student student = null;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stuID.equals(stu.getStuId())) {
                student = stu;
                break;
            }
        }
        return student;
    }

    public void updateStudent(Student student, int index) {
        list.set(index,student);
    }

    public void deleteStudent(String stuId) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stuId.equals(stu.getStuId())) {
                list.remove(i);
                break;
            }
        }
    }
}
