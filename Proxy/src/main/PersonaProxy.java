package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonaProxy implements InvocationHandler {
    private PersonaInterface persona;

    public PersonaProxy(PersonaInterface persona) {
        this.persona = persona;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("Before calling " + method.getName() + " method...");
        result = method.invoke(persona, args);
        System.out.println("After calling " + method.getName() + " method...");
        return result;
    }
}