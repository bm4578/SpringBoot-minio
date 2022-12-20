package xyz.onlytype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import xyz.onlytype.config.web.InitProject;

/**
 * @author 白也
 * @date 2022/12/19 9:06 下午
 * @title
 */
@SpringBootApplication
@EnableConfigurationProperties(InitProject.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
