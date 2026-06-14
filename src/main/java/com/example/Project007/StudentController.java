package com.example.Project007;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class StudentController {

    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String displayStudents() {
        return studentService.displayStudents();
    }

    @GetMapping("/{id}")
    public String displayStudent(@PathVariable int id){
        return studentService.displayStudentById(id);
    }

    @GetMapping ("/count")
    public String displayStudentCount(){
        return studentService.displayStudentCount();
    }

    @PostMapping("/enroll")
    public String enrollStudent(@RequestBody Student student){
        return studentService.enrollStudent(student);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id){
        return studentService.updateStudent(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }


}
