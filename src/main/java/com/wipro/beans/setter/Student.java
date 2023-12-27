package com.wipro.beans.setter;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("Student :: Constructor");
    }
    public int learning(){
        return  1;
    }
}
