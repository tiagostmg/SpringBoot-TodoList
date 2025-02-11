package com.example.desafiotodo.repository;

import com.example.desafiotodo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {

}
