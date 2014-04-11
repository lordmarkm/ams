package com.ams.http.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.baldy.commons.resourcedoc.config.SwaggerConfig;

@Configuration
public class AmsSwaggerConfig extends SwaggerConfig {

    public static final List<String> AMS_INCLUDE_PATTERNS = Arrays.asList(
        "/tenants", "/tenants/.*",
        "/rooms", "/rooms/.*"
    );

    @Override
    public List<String> getPatterns() {
        return AMS_INCLUDE_PATTERNS;
    }

}
