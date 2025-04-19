package LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;

public class FinishingHandler implements RequestHandler{

    @Override
    public void handle(Request request) {
        System.out.println("Finishing handler");
    }
}
