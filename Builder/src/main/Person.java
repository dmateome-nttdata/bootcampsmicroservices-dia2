package main;

public class Person {

	String name;
	int age;
	static Person person;
	
	public Person() {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
	
	 public static class PersonBuilder {
	        private final String name;
	        private int age=18;
	       

	        public PersonBuilder(String name) {
	            this.name = name;
	           
	        }

	        public PersonBuilder age(int age) {
	            this.age = age;
	            return this;
	        }

	        

	        public Person build() {
	            return new Person(this);
	        }
	    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	 
	 
}
