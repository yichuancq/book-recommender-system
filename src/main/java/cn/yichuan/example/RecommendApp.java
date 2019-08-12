package cn.yichuan.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.yichuan")
//@EnableSwagger2
public class RecommendApp implements CommandLineRunner {

    public static void main(String[] args) {
        //
        SpringApplication.run(RecommendApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
