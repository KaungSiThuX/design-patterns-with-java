package com.kst.structural.decorator;

import java.time.Instant;

public class TimeLogger implements Logger
{
    Logger logger;

    public TimeLogger(Logger logger)
    {
        this.logger = logger;
    }

    @Override
    public String log(String message)
    {
        return (this.logger.log(message) + " " + Instant.now());
    }
}
