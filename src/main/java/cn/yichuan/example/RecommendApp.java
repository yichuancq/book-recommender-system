package cn.yichuan.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.request.async.DeferredResult;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("cn.yichuan")
@EnableSwagger2
public class RecommendApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RecommendApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }

    /**
     * http://localhost:8088/druid/login.html
     * http://localhost:8088/swagger-ui.html#/
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了）
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .paths(or(regex("/.*")))//过滤的接口
                .build()
                .apiInfo(testApiInfo());
    }

    private ApiInfo testApiInfo() {
        ApiInfo apiInfo = new ApiInfo("基于Spring boot2+ 的图书推荐系统",//大标题
                "图书推荐系统",//小标题
                "0.1",//版本
                "NO terms of service",
                "易川",//作者
                "我的github链接",//链接显示文字
                "https://github.com/yichuancq"//网站链接
        );
        return apiInfo;
    }


}