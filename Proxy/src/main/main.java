package main;

import java.lang.reflect.Proxy;

public class main {
	public static void main(String[] args) {
        PersonaInterface persona = new Persona("David", 20);
        PersonaInterface personaProxy = (PersonaInterface) Proxy.newProxyInstance(
            persona.getClass().getClassLoader(),
            persona.getClass().getInterfaces(),
            new PersonaProxy(persona)
        );

        System.out.println("Nombre: " + personaProxy.getNombre());
        System.out.println("Edad: " + personaProxy.getEdad());
    }
}
