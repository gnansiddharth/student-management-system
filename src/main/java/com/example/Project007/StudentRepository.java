package com.example.Project007;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {

    // CRUD OPERATIONS ARE PERFORMED HERE BASICALLY

}
