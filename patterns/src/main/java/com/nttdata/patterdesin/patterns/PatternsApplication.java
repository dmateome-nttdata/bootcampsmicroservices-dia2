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
    @Autowired
    private Person singletonPerson;

    @Autowired
    private Person prototypePerson;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);

        // Obteniendo la instancia Singleton de Person
        Person singletonPerson1 = context.getBean("singletonPerson", Person.class);
        Person singletonPerson2 = context.getBean("singletonPerson", Person.class);

        // Verificando si las instancias son iguales (Singleton)
        System.out.println("Instancias Singleton iguales: " + (singletonPerson1 == singletonPerson2));

        // Obteniendo instancias Prototype de Person
        Person prototypePerson1 = context.getBean("prototypePerson", Person.class);
        Person prototypePerson2 = context.getBean("prototypePerson", Person.class);

        // Verificando si las instancias son distintas (Prototype)
        System.out.println("Instancias Prototype distintas: " + (prototypePerson1 != prototypePerson2));

    }

}
