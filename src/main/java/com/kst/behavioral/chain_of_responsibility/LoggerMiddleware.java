package com.kst.behavioral.chain_of_responsibility;

import java.time.Instant;

public class LoggerMiddleware implements Middleware
{
    @Override
    public void doFilter(Request request, Response response)
    {
        System.out.println("req " + request.url + " " + Instant.now());
    }
}
