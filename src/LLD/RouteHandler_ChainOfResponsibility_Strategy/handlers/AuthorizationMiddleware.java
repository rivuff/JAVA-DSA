package LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;

public class AuthorizationMiddleware implements RequestHandler {

    private final RequestHandler nextHandler;

    public AuthorizationMiddleware(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("Authorization handler");

        this.nextHandler.handle(request);
    }
}
