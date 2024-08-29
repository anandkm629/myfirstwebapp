package com.anandproject.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1,"anandmohan","Learn GCP",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"seetu","Learn AWS",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(3,"praveen","Learn Azure",
				LocalDate.now().plusYears(1),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}

}
