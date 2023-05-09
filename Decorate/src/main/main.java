package main;

public class main {
	
	public static void main(String[] args){
		Person person = new SimplePerson("David", 20);
		person = new BoldPersonDecorator(person);
		person = new ItalicPersonDecorator(person);

		System.out.println(person.getName()); 

	}
}
