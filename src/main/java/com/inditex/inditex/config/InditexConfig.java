package com.inditex.inditex.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.inditex.inditex.model.entity")
@ComponentScan("com.inditex.inditex.service.service")
public class InditexConfig {

}
