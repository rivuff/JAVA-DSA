package LLD.RouteHandler_ChainOfResponsibility_Strategy.factory;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers.*;

public class RequestHandlerFactory {
    public void handleRequest(){
        RequestHandler handler = new AuthenticationMiddleware(
                new AuthorizationMiddleware(
                        new BodyValidationMiddleware(
                                new ParamValidationMiddleware(
                                        new FinishingHandler()
                                )
                        )
                )
        );
    }
}
