package main;

public class SimplePerson implements Person {
    private String name;
    private int age;

    public SimplePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
