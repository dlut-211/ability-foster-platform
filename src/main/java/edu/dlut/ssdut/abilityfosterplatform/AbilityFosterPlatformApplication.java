package edu.dlut.ssdut.abilityfosterplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.dlut.ssdut.abilityfosterplatform.mapper")
public class AbilityFosterPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbilityFosterPlatformApplication.class, args);
    }

}
