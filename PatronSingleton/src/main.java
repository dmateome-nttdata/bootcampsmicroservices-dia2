
public class main {
	
	public static void main(String[] args) {
		Person p=new Person("david",20);
		System.out.println(p);
		System.out.println(p.getSingleton("david", 10));
		System.out.println(p.getSingleton("david", 15));
	}
}
