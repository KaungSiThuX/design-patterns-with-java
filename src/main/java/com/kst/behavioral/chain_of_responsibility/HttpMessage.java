package com.kst.behavioral.chain_of_responsibility;

import java.util.HashMap;

public class HttpMessage
{
    HashMap<String, String> headers = new HashMap<>();

    String getHeader(String headerKey)
    {
        return this.headers.get(headerKey);
    }

    void addHeader(String headerKey, String headerValue)
    {
        this.headers.put(headerKey, headerValue);
    }
}
