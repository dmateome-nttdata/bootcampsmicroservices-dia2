package main;

public class main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p=new Person("david",20);
		System.out.println(p);
		
		Person pc=p.clone();
		System.out.println(pc);
	}
}
