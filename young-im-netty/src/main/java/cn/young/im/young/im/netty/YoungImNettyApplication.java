package cn.young.im.young.im.netty;

import cn.young.im.young.im.netty.config.ImNettyConfig;
import cn.young.im.young.im.netty.server.ImWebSocketServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class YoungImNettyApplication implements CommandLineRunner {
    @Resource
    private ImNettyConfig imNettyConfig;

    public static void main(String[] args) {
        SpringApplication.run(YoungImNettyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new ImWebSocketServer(imNettyConfig).start();
    }
}
