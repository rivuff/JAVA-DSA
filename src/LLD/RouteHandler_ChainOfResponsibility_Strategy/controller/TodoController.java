package LLD.RouteHandler_ChainOfResponsibility_Strategy.controller;

import LLD.RouteHandler_ChainOfResponsibility_Strategy.DTO.Request;
import LLD.RouteHandler_ChainOfResponsibility_Strategy.factory.RequestHandlerFactory;
import LLD.RouteHandler_ChainOfResponsibility_Strategy.handlers.*;
import LLD.RouteHandler_ChainOfResponsibility_Strategy.schema.Todo;

public class TodoController {
    public Todo createTodo(Request request){
        // logic to create todo

        RequestHandlerFactory factory = new RequestHandlerFactory();
        factory.handleRequest();

        return new Todo();
    }
}
