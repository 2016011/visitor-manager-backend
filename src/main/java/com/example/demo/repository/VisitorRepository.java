package com.example.demo.repository;

import com.example.demo.models.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Inteface for Visitor Repository

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long>{

}
