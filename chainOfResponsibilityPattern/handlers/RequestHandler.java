package chainOfResponsibilityPattern.handlers;
import chainOfResponsibilityPattern.DTO.Request;

public interface RequestHandler {

    void handle(Request request); // what to do in a handler goes here
    
}
