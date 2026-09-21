package com.kst.behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class Framework
{
    List<Middleware> middlewareList = new ArrayList<>();
    List<Controller> controllerList = new ArrayList<>();

    void addMiddleware(Middleware middleware)
    {
        middlewareList.add(middleware);
    }

    void addController(Controller controller)
    {
        this.controllerList.add(controller);
    }

    void process(Request request, Response response)
    {
        try
        {
            if (!this.middlewareList.isEmpty())
            {
                for (Middleware middleware : middlewareList)
                {
                    middleware.doFilter(request, response);
                }
            }

            if (!this.controllerList.isEmpty())
            {
                for (Controller controller : controllerList)
                {
                    controller.handle(request, response);
                }
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
