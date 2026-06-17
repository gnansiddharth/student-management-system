package com.example.Project007;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepo;
    public StudentService(StudentRepository studentRepo){
        this.studentRepo = studentRepo;
    }


    public List<Student> displayStudents(){
        return  studentRepo.findAll();
    }

    public Student displayStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }

    public long displayStudentCount(){
        return studentRepo.count();
    }

    public String enrollStudent(Student student){
        studentRepo.save(student);
        return  "Student enrolled succesfully";
    }


    public List<Student> deleteStudent(int id){
        studentRepo.deleteById(id);
        System.out.println("Successfully deleted");
        return studentRepo.findAll();
    }


}
