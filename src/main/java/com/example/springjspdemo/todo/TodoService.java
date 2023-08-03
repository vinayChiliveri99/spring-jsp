package com.example.springjspdemo.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "admin", "Learn spring", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(++todosCount, "admin", "Learn jsps", LocalDate.now().plusMonths(5), false));
		todos.add(new Todo(++todosCount, "admin", "Learn angular", LocalDate.now().plusMonths(7), false));

	}
	
	public List<Todo> findByUserId(String userid) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean isdone)
	{
		Todo todo = new Todo(++todosCount, username, description, targetDate, isdone);
		todos.add(todo);
	}
}
