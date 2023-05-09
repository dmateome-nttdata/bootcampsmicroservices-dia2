package main;

public class PersonDecorator implements Person {
    private Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public int getAge() {
        return person.getAge();
    }
}