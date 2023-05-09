package main;

public class main {
	
	public static void main(String[] args){
		Person person = new Person.PersonBuilder("David").age(15)
                .build();
		System.out.println(person);
		Person per= new Person.PersonBuilder("David")
                .build();
		System.out.println(per);
	}
}
