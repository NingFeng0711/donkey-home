package com.donkey.module.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: donkey-home
 * @ClassName DonekyWebApplication
 * @description:
 * @author: lijinpeng
 * @create: 2026-05-09 16:05
 * @Version 1.0
 **/
@SpringBootApplication
public class DonkeyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DonkeyWebApplication.class, args);
        System.out.println("启动成功");
    }

//    @PreDestroy
//    public void destroy() {
//        LOGGER.error("ScrmCenterWebApplication is started（项目即将重启）");
//    }

}
