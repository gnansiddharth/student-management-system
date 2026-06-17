package com.example.Project007;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String branch;

   /*public void setId(int id){
        this.id = id;
    }
    */
    public void setName(String name){
        this.name = name;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
}
