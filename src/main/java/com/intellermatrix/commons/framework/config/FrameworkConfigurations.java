package com.intellermatrix.commons.framework.config;

import com.intellermatrix.commons.framework.services.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FrameworkConfigurations {

    @Bean
    public HelloWorldService getHelloWorld() {
        return new HelloWorldService();
    }
}
