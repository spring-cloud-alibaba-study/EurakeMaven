package com.js;

import com.js.util.StartLogo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@Slf4j
public class ConfigServiceApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ConfigServiceApplication.class, args);
            log.info(StartLogo.print());
            log.info("项目启动成功");
        } catch (Exception e) {
            log.info("项目启动失败");
        }
    }

}
