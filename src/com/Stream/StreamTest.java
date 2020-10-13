package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest {
	public static void main(String[] args) {
		
		List<String> stringCollection = new ArrayList<>();
		
		//经典的Stream操作。
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
		//filter
		stringCollection
	    .stream() 
	    .filter((s) -> s.startsWith("a")) //传入一个predicate， 对返回值为true的元素保留， false元素删除
	    .forEach(System.out::println); //传入一个Customers
		
		
		//sorted
		stringCollection
	    .stream() //让collection可以执行Stream操作
	    .sorted() //排序， 默认自然排序， 也可传入一个Comparator
	    .filter((s) -> s.startsWith("a")) //过滤
	    .forEach(System.out::println); //打印
		
		
		//map
		System.out.println("map: ");
		stringCollection
	    .stream()
	    .map(String::toUpperCase)//map操作的对象是当前collection中的每一个对象，从a变成a.toUpperCase。
	    .sorted((a, b) -> b.compareTo(a))
	    .forEach(System.out::println);

		
		
		//match  --终端操作，返回布尔类型量
		boolean anyStartsWithA =
			    stringCollection
			        .stream()
			        .anyMatch((s) -> s.startsWith("a")); //1.存在匹配， 就是其中一项放入pandicate返回true

			System.out.println(anyStartsWithA);      // true

			boolean allStartsWithA =
			    stringCollection
			        .stream()
			        .allMatch((s) -> s.startsWith("a")); //2.全称匹配， 所有项符合

			System.out.println(allStartsWithA);      // false

			boolean noneStartsWithZ =
			    stringCollection
			        .stream()
			        .noneMatch((s) -> s.startsWith("z")); //3.全称否定匹配，没有符合

			System.out.println(noneStartsWithZ);      // true
			
			
		//count
		long startsWithB =
			    stringCollection
			        .stream()
			        .filter((s) -> s.startsWith("b"))
			        .count(); //终端操作，返回数量
		
		
		//redece
		Optional<String> reduced =
			    stringCollection
			        .stream()
			        .sorted()
			        .reduce((s1, s2) -> s1 + "#" + s2); //返回一个optional对象

			reduced.ifPresent(System.out::println);
			// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"

			System.out.println(startsWithB);    // 3
			
	
			
		System.out.println("-----------");
		
		for(String ele : stringCollection) {
			System.out.println(ele); //虽然
		}
		
		/*
		 * Java8扩展了Collection， 所以可以使用Collection.stream() or Collection.parallelStream()进行流式操作。
		 * 
		 * stream创建了一个view of stream， 原来的collection没有改变。
		 * 同时， 每次对collection调用stream()方法，都会调用同样一个stream。
		 */
	}
}
