package com.nttdata.patterdesin.patterns;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {

    @Bean("singletonPerson")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person singletonPerson() {
        return new Person("David", 30);
    }

    @Bean("prototypePerson")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person prototypePerson() {
        return new Person("Mateo", 25);
    }

}
