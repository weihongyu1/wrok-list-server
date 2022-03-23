package com.why.worklistserver;

import com.why.worklistserver.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @ClassName：WorkListServerApplication
 * @Description：todospringboot 启动类
 * @Author: why
 * @DateTime：2022/3/20 15:41
 */
@SpringBootApplication
@Import(DataSourceConfig.class)
public class WorkListServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkListServerApplication.class,args);
    }
}
