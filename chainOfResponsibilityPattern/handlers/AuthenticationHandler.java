package chainOfResponsibilityPattern.handlers;
import chainOfResponsibilityPattern.DTO.Request;
import chainOfResponsibilityPattern.services.TokenService;

public class AuthenticationHandler implements RequestHandler {

    private final RequestHandler nextHandler;
    private final TokenService tokenService;

    public AuthenticationHandler(RequestHandler nextHandler, TokenService tokenService) {
        this.nextHandler = nextHandler;
        this.tokenService = tokenService;
    }

    @Override
    public void handle(Request request) {
        // Authentication logic here
        this.tokenService.validateToken(request);
        System.out.println("Authenticating request...");
        this.nextHandler.handle(request);
    }
    
}
