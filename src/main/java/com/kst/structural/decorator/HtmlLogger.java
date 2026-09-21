package com.kst.structural.decorator;

public class HtmlLogger implements Logger
{
    Logger logger;

    public HtmlLogger(Logger logger)
    {
        this.logger = logger;
    }

    @Override
    public String log(String message)
    {
        return "<html> " + this.logger.log(message) + " </html>";
    }
}
