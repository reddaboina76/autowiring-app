package com.wipro.beans.constructor;

import org.springframework.stereotype.Component;

@Component
public class Doctor {

    public Doctor(){
        System.out.println("Doctor :: Constructor");
    }
    public int Treatment(){
        return 1;
    }
}
