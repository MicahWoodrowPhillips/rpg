package com.lrg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lrg.model.character.rules.MasterRuleSet;

@Configuration
public class RpgConfig
{
    @Bean
    public MasterRuleSet masterRuleSet()
    {
        return new MasterRuleSet();
    }

}
