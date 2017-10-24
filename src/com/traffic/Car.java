package com.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by pk4 on 10/24/17.
 */
@Component
public class Car {
    private String model;

   public Car(@Value("Santro") String model)
   {
       this.model=model;
   }

    public String getModel() {
        return model;
    }
}
