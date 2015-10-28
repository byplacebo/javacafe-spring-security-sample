package net.javacafe.gaebal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 임형태
 * @since 2015.10.28
 */
@ComponentScan
@EnableAutoConfiguration
public class WebMvcApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebMvcApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication.class, args);
    }
}