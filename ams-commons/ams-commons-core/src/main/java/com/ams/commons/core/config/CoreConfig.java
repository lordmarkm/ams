package com.ams.commons.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mbmartinez
 */
@Configuration
@ComponentScan(basePackages = {"com.ams.comons.core", "com.ams.**.config"})
public class CoreConfig {

}
