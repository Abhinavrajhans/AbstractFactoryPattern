package chainOfResponsibilityPattern.handlers;

import chainOfResponsibilityPattern.DTO.Request;
public class FinishingHandler implements RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("Finishing request processing...");
    }
    
}
