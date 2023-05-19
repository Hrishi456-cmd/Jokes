package com.example.Random.Jokes.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class ToDo {
    @Repository
    public interface ToDo extends CrudRepository<ToDo, Long> {

    }
