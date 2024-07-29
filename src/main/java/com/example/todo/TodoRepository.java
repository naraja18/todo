package com.example.todo;

import java.util.*;
import com.example.todo.Todo;

public interface TodoRepository {
    ArrayList<Todo> getTodos();

    Todo addTodo(Todo todo);

    Todo getTodoById(int id);

    Todo updateTodo(int id, Todo todo);

    void deleteTodo(int id);
}