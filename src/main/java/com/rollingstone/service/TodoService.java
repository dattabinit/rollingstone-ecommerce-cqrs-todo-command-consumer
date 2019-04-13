package com.rollingstone.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rollingstone.domain.Todo;
import com.rollingstone.repositories.TodoRepository;

@Service
public class TodoService {

	private static final Logger log  = LoggerFactory.getLogger(TodoService.class);
	
	TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}
	
	public List<Todo> getAllTodos() {
		Iterable<Todo> todos = todoRepository.findAll();
		
		List<Todo> todoList = toList(todos);
		
		return todoList;
	}
	
	public Todo getTodo(Long todoId) {
		Optional<Todo> totoOptional = todoRepository.findById(todoId);
		
		Todo todo = totoOptional.get();
		
		return todo;
	}
	public static <T> List<Todo> toList(Iterable<Todo> todos) {
		return StreamSupport.stream(todos.spliterator(), false).collect(Collectors.toList());
	}
	
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todoRepository.delete(todo);
	}

}
