package com.kst.behavioral.chain_of_responsibility;

public interface Middleware
{
    void doFilter(Request request, Response response);
}
