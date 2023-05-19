package com.example.Random.Jokes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@Service
@RestController
public class ToDo {

    static  ArrayList<String> ToDo = new ArrayList<>();

    @Autowired
    private todoService todoService;

    // Save operation
    @PostMapping("/Todos")

    public Todo saveTodo(
            @Valid @RequestBody Todo todo)
    {
        return todoService.saveTodo(todo);
    }

    // Read operation
    @GetMapping("/Todos")

    public List<Todo> fetchTodoList()
    {
        return todoService.fetchTodoList();
    }

    // Update operation
    @PutMapping("/Todos/{id}")

    public Todo
    updateTodo(@RequestBody Todo Todo,
                     @PathVariable("id") Long TodoId)
    {
        return todoService.updateTodo(
                Todo, TodoId);
    }

    // Delete operation
    @DeleteMapping("/Todos/{id}")

    public String deleteTodoById(@PathVariable("id")
                                       Long TodoId)
    {
        TodoService.deleteTodoById(
                TodoId);
        return "Deleted Successfully";
    }


}
