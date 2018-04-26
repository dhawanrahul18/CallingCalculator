package org.workspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CallingApplication {
    public static void main(String[] args) {
        SpringApplication.run(CallingApplication.class,args);
    }
}
