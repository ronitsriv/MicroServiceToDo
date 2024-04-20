package com.example.microtodo.Todo;

import com.example.microtodo.Todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepositoryQueries extends JpaRepository<Todo, Integer> {

    // Create
    Todo save(Todo todo);

    // Read
    Todo findById(int id);
    List<Todo> findAll();
    List<Todo> findByUsername(String username); // Assuming username is a field in Todo entity

    // Update
    Todo saveAndFlush(Todo todo); // Assuming saveAndFlush is needed for updating
    // Delete
    void deleteById(int id);
}
