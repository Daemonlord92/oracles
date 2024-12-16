package org.blitmatthew;

import org.blitmatthew.config.AppConfig;
import org.blitmatthew.repository.UserRepository;
import org.blitmatthew.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplitcationContext.xml");

        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserRepository userRepository = context.getBean(UserRepository.class);
//
////        userRepository.findById(15l);
//
//        UserService userService = context.getBean(UserService.class);
//
//        if (userService == null) {
//            System.out.println("DI failed");
//        } else {
//            System.out.println("DI success");
//            System.out.println(userService);
//        }

//        UserService userService = context.getBean(UserService.class);
//
//
//        if (userService == null) {
//            System.out.println("DI failed");
//        } else {
//            System.out.println("DI success");
//            System.out.println(userService);
//        }


        // Create an ApplicationContext using the AppConfig class
        // AnnotationConfigApplicationContext is used for Java-based configuration.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetching the UserService bean from the Spring container
        // The getBean method retrieves a managed bean by its type or name.
        UserService userService = context.getBean(UserService.class);

        // Checking if the UserService bean was successfully injected
        if (userService == null) {
            // If null, dependency injection failed
            System.out.println("DI failed");
        } else {
            // If not null, dependency injection succeeded
            System.out.println("DI success");
            System.out.println(userService); // Print the UserService instance
        }
    }
}