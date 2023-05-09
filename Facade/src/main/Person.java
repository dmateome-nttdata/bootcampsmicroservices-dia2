package main;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String nombre;
    private int age;

    public Person(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAge() {
        return age;
    }

    public static class PersonFacade {
        private List<Person> personas;

        public PersonFacade(List<Person> personas) {
            this.personas = personas;
        }

        public List<Person> getPersonasEntre20y30() {
            List<Person> resultado = new ArrayList<>();
            for (Person persona : personas) {
                if (persona.getAge() >= 20 && persona.getAge() <= 30) {
                    resultado.add(persona);
                }
            }
            return resultado;
        }
    }
}

