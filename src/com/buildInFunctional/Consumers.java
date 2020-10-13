package com.buildInFunctional;

import java.util.function.Consumer;

import com.MethodAndConstructorReferences.Person;

public class Consumers {
	public static void main(String[] args) {
		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
		greeter.accept(new Person("Luke", "Skywalker"));
		/**
		 * 消费者，仅仅accept东西，不吐出来。只有参数没有返回值。
		 * 
		 * 有一个default方法， 叫做addThen。
		 * 例如： consu1.addThen(consu2);
		 *	它返回一个新的consu， 这个consumer会调用两个consu的方法体。
		 */
	}
}
