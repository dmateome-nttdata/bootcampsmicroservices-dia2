package main;

import java.util.ArrayList;
import java.util.List;

import main.Person.PersonFacade;

public class Main {

	public static void main(String[] args) {
	    List<Person> personas = new ArrayList<>();
	    personas.add(new Person("Juan", 25));
	    personas.add(new Person("Pedro", 18));
	    personas.add(new Person("María", 32));
	    personas.add(new Person("Ana", 28));

	    PersonFacade facade = new PersonFacade(personas);
	    List<Person> personasEntre20y30 = facade.getPersonasEntre20y30();

	    System.out.println("Personas entre 20 y 30 años:");
	    for (Person persona : personasEntre20y30) {
	        System.out.println(persona.getNombre() + " - " + persona.getAge() + " años");
	    }
	}

}
