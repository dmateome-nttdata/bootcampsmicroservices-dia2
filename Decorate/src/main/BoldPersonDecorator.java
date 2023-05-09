package main;

public class BoldPersonDecorator extends PersonDecorator {
    public BoldPersonDecorator(Person person) {
        super(person);
    }

    @Override
    public String getName() {
        return "<b>" + super.getName() + "</b>";
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}
