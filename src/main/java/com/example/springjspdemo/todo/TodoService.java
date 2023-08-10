package com.example.springjspdemo.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.validation.Valid;

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

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = 
				todo -> todo.getId() == id;
		todos.removeIf(predicate);
		
	}

	public Todo findByUserId(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = 
				todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
		
	}


}
