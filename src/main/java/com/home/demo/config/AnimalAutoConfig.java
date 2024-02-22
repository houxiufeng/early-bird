package com.home.demo.config;

import com.home.demo.service.AnimalService;
import com.home.demo.service.impl.CatService;
import com.home.demo.service.impl.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AnimalProperties.class)
public class AnimalAutoConfig {
    @Autowired
    private AnimalProperties animalProperties;

    @Bean
    public AnimalService demoService(){
        switch (animalProperties.getName()){
            case "cat":
                return new CatService();
            case "dog":
                return new DogService();
            default:
                return null;
        }
    }
}
