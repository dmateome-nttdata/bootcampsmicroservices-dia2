package com.nttdata.patterdesin.patterns;

import lombok.*;
import org.springframework.beans.factory.annotation.Configurable;


@Configurable
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person implements Cloneable{

	String name;
	int age;
	static Person person;

	public static Person getPerson(String name, int age) {
		return new Person(name, age);
	}


}
