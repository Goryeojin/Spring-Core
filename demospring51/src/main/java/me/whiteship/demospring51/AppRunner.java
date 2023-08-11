package me.whiteship.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    MessageSource messageSource; // ApplicationContext extends MessageSource

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

//        Environment environment = ctx.getEnvironment();
//        System.out.println(Arrays.toString(environment.getActiveProfiles()));
//        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
//        System.out.println(environment.getProperty("app.name"));
//        System.out.println(appName);
        while (true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"ryeojin"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"ryeojin"}, Locale.getDefault()));
            Thread.sleep(1000L);
        }
    }
}
