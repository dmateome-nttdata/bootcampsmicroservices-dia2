package com.nttdata.patterdesin.patterns;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@SpringBootApplication
public class PatternsApplication {
   

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);


        Person singletonPerson1 = context.getBean("singletonPerson", Person.class);
        Person singletonPerson2 = context.getBean("singletonPerson", Person.class);


        System.out.println("Instancias Singleton iguales: " + (singletonPerson1 == singletonPerson2));

        Person prototypePerson1 = context.getBean("prototypePerson", Person.class);
        Person prototypePerson2 = context.getBean("prototypePerson", Person.class);


        System.out.println("Instancias Prototype distintas: " + (prototypePerson1 != prototypePerson2));

    }

}
