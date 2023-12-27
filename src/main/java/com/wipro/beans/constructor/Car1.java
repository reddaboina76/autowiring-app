package com.wipro.beans.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car1 {
    private Engine1 eng;
    @Autowired
    public Car1(Engine1 eng){
        this.eng=eng;
        System.out.println("Car1 :: Constructor");
    }
    public void drive(){
        int start = eng.start();
        if(start >= 1){
            System.out.println("Journey Started...(Constructor Injection)!!");
        }
    }

}
