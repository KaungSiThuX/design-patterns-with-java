package com.kst.structural.flyweight;

import java.util.HashMap;

public class PlatformFactory
{
    private HashMap<PlatformType, Platform> platformMap = new HashMap<>();

    Platform getPlatform(PlatformType platformType)
    {
        if (platformMap.containsKey(platformType))
        {
            return platformMap.get(platformType);
        }
        else
        {
            Platform platform = null;

            switch (platformType)
            {
                case JAVA -> platform = new JavaPlatform();

                case NODEJS -> platform = new NodejsPlatform();
            }

            platformMap.put(platformType, platform);
            
            return platformMap.get(platformType);
        }
    }
}
