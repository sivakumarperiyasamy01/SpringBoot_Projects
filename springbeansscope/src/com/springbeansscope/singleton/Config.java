package com.springbeansscope.singleton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springbeansscope") // it will scan own packages and subpackages
public class Config {

}
