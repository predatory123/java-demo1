package com.qa.heima.controller;

import com.qa.heima.pojo.Student;
import com.qa.heima.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public void add(Student student) {
        studentService.addStudent(student);
    }

    public void findAll() {
        studentService.findAllStudent();
    }

    public void findById(String stuID) {
        studentService.findStudentById(stuID);
    }

    public void update(Student student) {
        studentService.updateStudent(student);
    }

    public void delete(String stuId) {
        studentService.deleteStudent(stuId);
    }
}
