package main;

public class ItalicPersonDecorator extends PersonDecorator {
    public ItalicPersonDecorator(Person person) {
        super(person);
    }

    @Override
    public String getName() {
        return "<i>" + super.getName() + "</i>";
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}