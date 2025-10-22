package chainOfResponsibilityPattern.handlers;

import chainOfResponsibilityPattern.DTO.Request;

public class AuthorizationHandler implements RequestHandler {
    
    private final RequestHandler nextHandler;

    public AuthorizationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    @Override
    public void handle(Request request) {
        System.out.println("Authorizing request...");
        this.nextHandler.handle(request);
    }
}
