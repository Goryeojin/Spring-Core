package me.whiteship.demospring51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@PropertySource("classpath:/app.properties")
//@EnableAsync
public class Demospring51Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demospring51Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        SpringApplication.run(Demospring51Application.class, args);
    }

//    @Bean
    public MessageSource messageSource() {
        var messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3);
        return messageSource;
    }

}
