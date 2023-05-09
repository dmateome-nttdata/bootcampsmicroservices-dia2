package com.nttdata.patterdesin.patterns;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Configurable;


@Configurable
@Builder
public class Person implements Cloneable{

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
	public static Person getPerson(String name, int age) {
		return new Person(name, age);
	}


}
