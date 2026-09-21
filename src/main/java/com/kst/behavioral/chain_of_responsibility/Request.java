package com.kst.behavioral.chain_of_responsibility;

public class Request extends HttpMessage
{
    String url;

    public Request(String url)
    {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
