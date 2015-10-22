package net.javacafe.chickenshop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 임형태
 * @since 2015.10.22
 */
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class ChickenShopApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder();

        ChickenShopApplication application = new ChickenShopApplication();
        application.configure(builder);

        builder.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ChickenShopApplication.class);
    }
}
