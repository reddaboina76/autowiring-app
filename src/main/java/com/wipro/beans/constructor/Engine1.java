package com.wipro.beans.constructor;

import org.springframework.stereotype.Component;

@Component
public class Engine1 {

    public Engine1(){

        System.out.println("Engine1 :: Constructor");
    }

    public int start(){
        return 1;
    }

}
