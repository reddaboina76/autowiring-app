package com.wipro.beans.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

    private Doctor dc;

    @Autowired
    public Hospital(Doctor dc){
        this.dc=dc;
        System.out.println("Hospital :: Constructor ");
    }
    public void Staff(){
        int treatment = dc.Treatment();
        if (treatment >= 1){
            System.out.println("Treatment Started...(COnstructor Injection)");
        }

    }

}
