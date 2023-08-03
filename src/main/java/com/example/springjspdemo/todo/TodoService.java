package com.example.springjspdemo.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "admin", "Learn spring", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(2, "admin", "Learn jsps", LocalDate.now().plusMonths(5), false));
		todos.add(new Todo(3, "admin", "Learn angular", LocalDate.now().plusMonths(7), false));

	}
	
	public List<Todo> findByUserId(String userid) {
		return todos;
	}

}
