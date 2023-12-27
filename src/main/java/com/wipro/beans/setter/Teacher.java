package com.wipro.beans.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    private Student std;
    @Autowired
    public void setStd(Student std) {
        this.std = std;
    }

    public Teacher(){
        System.out.println("Teacher :: Constructor");
    }

    public void teaching(){
        int learning = std.learning();
        if (learning >= 1){
            System.out.println("Student Learning...");
        }

    }

}
