package com.smartsavings.config;

@Configuration
public class AppConfig {

    @Bean
    public BenefitService benefitService() {
        return new BenefitServiceImpl();
    }



}

