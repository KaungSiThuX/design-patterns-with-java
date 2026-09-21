package com.kst.behavioral.chain_of_responsibility;

import java.util.Objects;

public class AuthMiddleware implements Middleware
{
    @Override
    public void doFilter(Request request, Response response)
    {
        if (!Objects.equals(request.headers.get("token"), "bearer"))
        {
            throw new RuntimeException("unauthorized");
        }
        else
        {
            System.out.println("authentication ok");
        }
    }
}
