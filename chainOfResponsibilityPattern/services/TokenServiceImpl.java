package chainOfResponsibilityPattern.services;

import chainOfResponsibilityPattern.DTO.*;

public class TokenServiceImpl implements TokenService {

    
    @Override
    public boolean validateToken(Request request) {
        // Dummy token validation logic
        System.out.println("Validating token for the request...");
        // fetches token from header
        // if token is not found return not 404 token missing.
        // validates the token using the key
        // if token is invalid then return not authenticated
        return true; // Assume token is always valid for this example
    }
    
}
