package com.rollingstone.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

import com.rollingstone.command.GenericCommandType;
import com.rollingstone.command.TodoCommand;
import com.rollingstone.domain.Todo;
import com.rollingstone.service.TodoService;

@Service
public class AWSSQSQueueListener {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private TodoService todoService;
	
	public AWSSQSQueueListener(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@SqsListener(value = "${sqs.todo.queue}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
	public void handleTodoCreateOrUpdateMessage(TodoCommand todoCommand) {
		logger.info("We received the TodoCommand Message from AWS SQS");
		
		String type = todoCommand.getHeader().getCommandType();
		
		Todo todo = todoCommand.getTodo();
		
		logger.info("We received the TodoCommand Message Header as : " + type);
		
		logger.info("The Todo We Received is :"+todo.toString());
		
		if (type.equalsIgnoreCase(GenericCommandType.CREATE_TODO.toString())) {
			todoService.saveTodo(todo);
		}
		else if (type.equalsIgnoreCase(GenericCommandType.UPDATE_TODO.toString())){
			todoService.saveTodo(todo);
		}
		else if (type.equalsIgnoreCase(GenericCommandType.DELETE_TODO.toString())){
			todoService.deleteTodo(todo);
		}
	}
}
