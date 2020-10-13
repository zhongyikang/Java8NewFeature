package com.buildInFunctional;

import java.util.function.Supplier;

import com.MethodAndConstructorReferences.Person;

public class Suppliers {
	public static void main(String[] args) {
		Supplier<Person> personSupplier = Person::new;
		personSupplier.get();   // new Person
		
		/**
		 * 单纯供应，不接受任何参数， 返回内容。 一般用于空参反回对象。
		 */
	}
}
