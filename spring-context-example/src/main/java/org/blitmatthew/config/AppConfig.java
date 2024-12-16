package org.blitmatthew.config;

import org.blitmatthew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Indicates that this class is a configuration class for Spring
@Configuration
// Enables component scanning for the specified base package
// This allows Spring to automatically detect and register beans annotated with
// @Component, @Service, @Repository, and @Controller within the package "org.blitmatthew"
@ComponentScan(basePackages = "org.blitmatthew")
public class AppConfig {

    // Injects an instance of UserService into this class
    // Spring will automatically resolve and inject a bean of type UserService
    // This requires a bean of type UserService to be available in the Spring context
    @Autowired
    private UserService userService;

    // Note: Currently, there are no explicit @Bean methods in this class,
    // as component scanning handles bean registration automatically.
}
