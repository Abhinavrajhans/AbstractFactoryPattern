package chainOfResponsibilityPattern.controllers;

import chainOfResponsibilityPattern.model.Todo;
import chainOfResponsibilityPattern.DTO.Request;
import chainOfResponsibilityPattern.factory.RequestHandlerFactory;
import chainOfResponsibilityPattern.handlers.RequestHandler;

import java.util.List;

public class TodoController {


    private List<RequestHandler> handlers;  


    private Todo createTodo(Request request){

        RequestHandlerFactory.getHandlerForCreateTodo().handle(request);

        // Execute initial handlers initially
        // if all handlers pass, create the Todo   
        return new Todo();
    }
}
