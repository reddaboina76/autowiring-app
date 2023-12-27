package com.wipro.beans.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine eng;
    @Autowired
    public void setEng(Engine eng){
        this.eng=eng;
    }
    public Car(){

        System.out.println("Car :: Constructor Executed!!");
    }
    public void drive(){
        int status = eng.start();
        if (status >=1){
            System.out.println("Journey Started......!!");
        }
    }
}
