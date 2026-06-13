package com.example.Project007;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @GetMapping
    public String displayStudents() {
        return "Displaying all enrolled students";
    }

    @GetMapping("/{id}")
    public String displayStudent(@PathVariable int id){
        return  "Displaying student with roll no: "+id;
    }

    @GetMapping ("/count")
    public String displayStudentCount(){
        return "Total students: 500";
    }

    @PostMapping("/enroll")
    public String enrollStudent(@RequestBody Student student){
        return student.getName();
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id){
        return "Student updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return "Student deleted";
    }


}
