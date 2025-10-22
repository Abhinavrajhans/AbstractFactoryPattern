package chainOfResponsibilityPattern.handlers;

import chainOfResponsibilityPattern.DTO.Request;

public class ValidateBodyHandler implements RequestHandler {

    private final RequestHandler nextHandler;

    public ValidateBodyHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    
    @Override
    public void handle(Request request) {

        //Above the next handler call , whatever is writtern is executed first
        System.out.println("Validating request body...");
        this.nextHandler.handle(request);
        //Below the next handler call , whatever is writtern is executed last
    }
}
