package chainOfResponsibilityPattern.factory;

import chainOfResponsibilityPattern.handlers.AuthenticationHandler;
import chainOfResponsibilityPattern.handlers.AuthorizationHandler;
import chainOfResponsibilityPattern.handlers.FinishingHandler;
import chainOfResponsibilityPattern.handlers.RequestHandler;
import chainOfResponsibilityPattern.handlers.ValidateBodyHandler;
import chainOfResponsibilityPattern.handlers.ValidateParamsHandler;
import chainOfResponsibilityPattern.services.TokenServiceImpl;

public class RequestHandlerFactory {

    public static RequestHandler getHandlerForCreateTodo(){
        return new ValidateParamsHandler(
            new ValidateBodyHandler( 
                new AuthenticationHandler( 
                    new AuthorizationHandler(
                        new FinishingHandler()
                    ),new TokenServiceImpl()
                )
            )
        );
        
    }
    

    public static RequestHandler getHandlerForUpdateTodo(){
        return new ValidateParamsHandler(
            new ValidateBodyHandler( 
                new AuthenticationHandler( 
                    new AuthorizationHandler(
                        new FinishingHandler()
                    ),new TokenServiceImpl()
                )
            )
        );
        
    }
}
