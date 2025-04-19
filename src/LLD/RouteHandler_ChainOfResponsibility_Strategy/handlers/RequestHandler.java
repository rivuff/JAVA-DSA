package LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;

public interface RequestHandler {


    void handle (Request request); // handles the logic of what the middleware will do
}
