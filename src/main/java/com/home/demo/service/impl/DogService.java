package com.home.demo.service.impl;

import com.home.demo.service.AnimalService;
import org.springframework.stereotype.Service;

public class DogService implements AnimalService {
    @Override
    public String say() {
        return "wang wang!";
    }
}
