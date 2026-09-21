package com.kst.behavioral.chain_of_responsibility;

public class ChainOfResponsibilityDemo
{
    static void main()
    {
        Request request = new Request("http://localhost:3000");
        request.headers.put("token", "bearer");

        Response response = new Response();

        AuthMiddleware authMiddleware = new AuthMiddleware();
        LoggerMiddleware loggerMiddleware = new LoggerMiddleware();

        RestController restController = new RestController();

        Framework framework = new Framework();
        framework.addMiddleware(authMiddleware);
        framework.addMiddleware(loggerMiddleware);
        framework.addController(restController);

        framework.process(request, response);
    }
}
