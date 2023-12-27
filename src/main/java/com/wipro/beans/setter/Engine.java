package com.wipro.beans.setter;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine(){

        System.out.println("Engine :: Constructor Executed!!");
    }
    public int start(){
        System.out.println("Engine Executed.... ");
        return 1;
    }
}
