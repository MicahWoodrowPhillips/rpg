package com.lrg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lrg.d20.rules.MasterRuleSet;

@Configuration
public class RpgConfig
{
    @Bean
    public MasterRuleSet masterRuleSet()
    {
        System.out.println("Made a MasterRuleSet bean!");
        return new MasterRuleSet();
    }

}
