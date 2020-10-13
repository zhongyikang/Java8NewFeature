package com.buildInFunctional;

import java.util.Comparator;

import com.MethodAndConstructorReferences.Person;

public class Comparators {
	public static void main(String[] args) {
		Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");

		comparator.compare(p1, p2);             // > 0
		comparator.reversed().compare(p1, p2);  // < 0
		
		/**
		 * 一个类有了Comparable接口， 就可以实现ComparaTo方法.
		 * Comparator接口有Compara方法。
		 * Comparator的compare一般都在内部调用ComparaTo方法。
		 * 
		 * Java8的Comparator还实现了default方法， 例如上面的reversed(), 对结果取相反数。
		 */
	}
}
