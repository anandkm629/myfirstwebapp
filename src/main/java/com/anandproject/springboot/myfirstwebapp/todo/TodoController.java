package com.anandproject.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	
	
	public TodoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}

	private ToDoService todoService;
	
	//list-todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		
		List<Todo> todos = todoService.findByUsername("anandMohan");
		model.addAttribute("todos",todos);
		return "listTodos";
	}
	
}
