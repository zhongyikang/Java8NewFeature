package com.buildInFunctional;

import java.util.Objects;
import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;

		predicate.test("foo");              // true
		predicate.negate().test("foo");     // false

		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;

		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		
		Predicate<String> other = (s) -> s.length() == 5;
		boolean result = predicate.and(other).test("abcde");
		System.out.println(result);
		
		
		/**
		 * Predicate（谓语）是第一个内置函数式接口。它的特征是：
		 * 传入一个参数T，返回boolean类型。
		 * 它有好几个default方法
		 * 1. and()
		 * 2. negate()
		 * 3. or()
		 * 
		 * 三个方法的本质都是重新构建一个concret type， 分别对返回的boolean 做 and、取反、或操作， 然后返回这个实例。
		 */
	}
}
