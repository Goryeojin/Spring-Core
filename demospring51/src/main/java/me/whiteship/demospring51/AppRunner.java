package me.whiteship.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

//    @Autowired
//    MessageSource messageSource; // ApplicationContext extends MessageSource

//    @Autowired
//    ApplicationEventPublisher publisher; // ApplicationContext extends ApplicationEventPublisher

//    @Autowired
//    ResourceLoader resourceLoader; // ApplicationContext extends ResourcePatternResolver;

//    @Autowired
//    BookRepository bookRepository;
//
//    @Value("${app.name}")
//    String appName;

    /* SingleTone and ProtoType Bean 테스트
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("proto");

        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));

        System.out.println("single");
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));

        System.out.println("proto by single");
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
    }
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {

        /* ApplicationContext 가 상속하는 Environment 의 Profiles, Property 기능 사용
        Environment environment = ctx.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(environment.getProperty("app.name"));
        System.out.println(appName);
         */

        /* ApplicationContext 가 상속하는 MessageSource 기능 사용
        while (true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"ryeojin"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"ryeojin"}, Locale.getDefault()));
            Thread.sleep(1000L);
        }
         */

//        publisher.publishEvent(new MyEvent(this, 100));

        System.out.println(resourceLoader.getClass());

        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.getClass());

        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI())));
    }
}
