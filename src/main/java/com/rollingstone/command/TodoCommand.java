package com.rollingstone.command;

import java.util.UUID;

import com.rollingstone.command.interfaces.GenericCommand;
import com.rollingstone.domain.Todo;

public class TodoCommand implements GenericCommand {

	UUID id;
	GenericCommandHeader header;
	Todo todo;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public GenericCommandHeader getHeader() {
		return header;
	}
	public void setHeader(GenericCommandHeader header) {
		this.header = header;
	}
	public Todo getTodo() {
		return todo;
	}
	public void setTodo(Todo todo) {
		this.todo = todo;
	}
	public TodoCommand(UUID id, GenericCommandHeader header, Todo todo) {
		super();
		this.id = id;
		this.header = header;
		this.todo = todo;
	}
	public TodoCommand() {
		super();
	}
	@Override
	public String toString() {
		return "TodoCommand [id=" + id + ", header=" + header + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoCommand other = (TodoCommand) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
