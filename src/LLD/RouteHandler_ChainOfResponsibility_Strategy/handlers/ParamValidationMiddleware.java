package LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;

public class ParamValidationMiddleware implements RequestHandler{

    private final RequestHandler nextHandler;

    public ParamValidationMiddleware(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("Params Handler");

        this.nextHandler.handle(request);
    }
}
