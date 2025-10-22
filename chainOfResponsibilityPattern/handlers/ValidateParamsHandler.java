package chainOfResponsibilityPattern.handlers;

import chainOfResponsibilityPattern.DTO.Request;

public class ValidateParamsHandler implements RequestHandler {

    private final RequestHandler nextHandler;

    public  ValidateParamsHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("Validating request parameters...");
        this.nextHandler.handle(request);
    }
    
}
