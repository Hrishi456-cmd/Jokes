package com.example.Random.Jokes.Service;

public class ToDoService {

    Todo saveTodo(Todo todo);


    List<Todo> fetchTodoList();


    Todo updateTodo(Todo todo,Long todoId);


    void deleteTodoById(Long TodoId);
}
