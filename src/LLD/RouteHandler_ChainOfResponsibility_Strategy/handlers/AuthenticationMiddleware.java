package LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;

public class AuthenticationMiddleware implements RequestHandler{

    private final RequestHandler nextHandler;

    public AuthenticationMiddleware(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    @Override
    public void handle(Request request) {
        System.out.println("Authentication handle");

        this.nextHandler.handle(request);
    }
}
