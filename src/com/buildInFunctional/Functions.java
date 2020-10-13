package com.buildInFunctional;

import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);

		backToString.apply("123");     // "123"

		
		/**
		 * 两个泛型分别是传入参数类型和返回值类型。
		 * 内部抽象方法是一个参数， 一个返回值。
		 * 
		 * 它有两个default方法：
		 * 1. andThen。 func1.addThen(func2)： 把一个func2运行的返回值作为func1的参数， 以此构建一个新的function。
		 * 2.
		 */
		
		
	}
}
