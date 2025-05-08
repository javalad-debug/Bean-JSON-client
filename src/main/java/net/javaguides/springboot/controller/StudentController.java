package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(
                "John",
              "Doe",
              1
        );
        return student;
    }
// http://localhost:8080/students
@GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Doe","John",1));
        students.add(new Student("John2", "Doe2", 2));
        students.add(new Student("Doe3", "John3", 3));
        students.add(new Student("Doe4","John4", 4));
        return students;
    }
}
