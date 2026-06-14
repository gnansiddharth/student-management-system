package com.example.Project007;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String displayStudents(){
        return "Displaying all enrolled students";
    }

    public String displayStudentById(int id){
        return "displaying student with id "+id;
    }

    public String displayStudentCount(){
        return "Total students: 500";
    }

    public String enrollStudent(Student student){
        return "enrolled student: "+student.getName();
    }

    public String updateStudent(int id){
        return "Student with "+id+" has been updated";
    }

    public String deleteStudent(int id){
        return "Student with "+id+" has been deleted";
    }


}
