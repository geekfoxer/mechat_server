package com.glozz.mechat.server.ws;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

/**
 * @author zhuji on 2019-07-20
 */
@Component
public class WsServer {

    private EventLoopGroup boss;
    private EventLoopGroup worker;
    private ServerBootstrap serverBootstrap;
    private ChannelFuture channelFuture;

    public void start() {
        channelFuture = serverBootstrap.bind(8088);
        System.err.println("netty server start");
    }

    private static class SingletonWsServer {
        static final WsServer INSTANCE = new WsServer();
    }

    private WsServer() {
        boss = new NioEventLoopGroup();
        worker = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap()
                .group(boss, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChatInitializer());
    }

    public static WsServer getInstance() {
        return SingletonWsServer.INSTANCE;
    }

}
