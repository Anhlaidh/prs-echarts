package edu.prs.echarts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "edu.prs.echarts.Mapper")
public class EchartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchartsApplication.class, args);
    }

}
