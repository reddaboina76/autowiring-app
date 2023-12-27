package com.wipro;

import com.wipro.beans.constructor.Car1;
import com.wipro.beans.constructor.Hospital;
import com.wipro.beans.setter.Car;
import com.wipro.beans.setter.Student;
import com.wipro.beans.setter.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Car car = context.getBean(Car.class);
        car.drive();

      Teacher bean = context.getBean(Teacher.class);
        bean.teaching();

        //Constructor Injection
        Car1 car1 = context.getBean(Car1.class);
        car1.drive();

        Hospital hospital = context.getBean(Hospital.class);
        hospital.Staff();
    }

}
