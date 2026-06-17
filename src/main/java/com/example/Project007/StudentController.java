package com.example.Project007;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> displayStudents() {
        return studentService.displayStudents();
    }

    @GetMapping("/{id}")
    public Student displayStudent(@PathVariable int id){
        return studentService.displayStudentById(id);
    }

    @GetMapping ("/count")
    public long displayStudentCount(){
        return studentService.displayStudentCount();
    }

    @PostMapping("/enroll")
    public String enrollStudent(@RequestBody Student student){
        return studentService.enrollStudent(student);
    }


    @DeleteMapping("/delete/{id}")
    public List<Student> deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }


}
