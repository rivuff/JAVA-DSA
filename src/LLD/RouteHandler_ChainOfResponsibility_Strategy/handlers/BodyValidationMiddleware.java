package LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;

public class BodyValidationMiddleware implements RequestHandler{
    private final RequestHandler nextHandler;

    public BodyValidationMiddleware(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    @Override
    public void handle(Request request) {
        System.out.println("Body validator");

        this.nextHandler.handle(request);
    }
}
