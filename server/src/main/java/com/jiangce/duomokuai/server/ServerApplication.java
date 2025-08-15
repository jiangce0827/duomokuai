package com.jiangce.duomokuai.server;

import com.jiange.duomikuai.common.utils.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        System.out.println("\u001B[34m" +
                "╔══════════════════════════════════╗\n" +
                "║     🚀 Server Started OK! 🚀     ║\n" +
                "╚══════════════════════════════════╝" +
                "\u001B[0m");

    }

}
