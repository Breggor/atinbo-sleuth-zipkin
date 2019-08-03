package com.atinbo.sleuth.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringCloudApplication
public class AtinboZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(AtinboZipkinApplication.class, args);
    }
}
