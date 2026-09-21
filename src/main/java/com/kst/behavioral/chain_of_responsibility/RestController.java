package com.kst.behavioral.chain_of_responsibility;

public class RestController implements Controller
{
    @Override
    public void handle(Request request, Response response)
    {
        System.out.println("handle " + request.url + " in controller");
    }
}
