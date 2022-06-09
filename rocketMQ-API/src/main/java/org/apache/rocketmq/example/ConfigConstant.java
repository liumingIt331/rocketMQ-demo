package org.apache.rocketmq.example;

import io.netty.channel.DefaultChannelId;

public class ConfigConstant {

    public static final String NAMESRV_ADDR = "192.168.138.200:9876";

    static {
        DefaultChannelId.newInstance();
    }
}
