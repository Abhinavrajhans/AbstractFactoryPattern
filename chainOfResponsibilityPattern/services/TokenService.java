package chainOfResponsibilityPattern.services;

import chainOfResponsibilityPattern.DTO.*;

public interface TokenService {
  boolean validateToken(Request request);  
}
