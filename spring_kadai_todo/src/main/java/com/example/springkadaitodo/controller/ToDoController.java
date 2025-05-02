package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {

	private final ToDoService toDoService;
	
	public ToDoController(ToDoService toDoService) {
		this.toDoService=toDoService;
	}
	
	@GetMapping("/todo")
	public String todo(Model model) {
		List<ToDo> todos=toDoService.getAllUsers();
		model.addAttribute("todos", todos);
		return "todoView";
	}
}
