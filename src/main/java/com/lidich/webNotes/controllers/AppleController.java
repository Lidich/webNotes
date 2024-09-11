package com.lidich.webNotes.controllers;

import com.lidich.webNotes.dbModels.Apple;
import com.lidich.webNotes.repositories.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppleController {
    @Autowired
    AppleRepository appleRepository;

    @GetMapping(path = "/apple")
    @Description(value = "getAll")
    public List<Apple> apple() {
        return appleRepository.findAll();
    }

    @PostMapping(path = "/apple")
    @Description(value = "postApple")
    public Apple postApple(@RequestBody Apple apple) {
        return appleRepository.save(apple);
    }
}
