package com.bkake.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfiguration {
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
