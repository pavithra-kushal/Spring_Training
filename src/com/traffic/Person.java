package com.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pk4 on 10/24/17.
 */
@Component
@Scope("prototype")
public class Person {
    public String getName() {
        return name;
    }

    @Value("Hello")
    public String name;

    @Autowired
    private Car car = new Car("Santro");


    @Resource(name = "stockList")
    private List<String> stock;

    public List<String> getStock() {
        return stock;
    }

    public Car getCar() {
        return car;
    }

    public void setName(String name) {
        this.name = name;
    }

}