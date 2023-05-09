
public class Person{

	String name;
	int age;
	static Person person;
	
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public static Person getSingleton(String name,int age) {
		if(person==null) {
			person=new Person(name,age);
		}
		return person;
	}
	
	
	
	
	
}
