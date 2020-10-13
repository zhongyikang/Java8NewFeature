package com.MethodAndConstructorReferences;

public class PersonTest {
	public static void main(String[] args) {
		PersonFactory<Person> factory = Person::new;
		/**
		 * 构造器引用， ‘::’
		 * 
		 * 对构造器引用运行原理的思考：
		 * PersonFactory是一个接口， 要创建concret type， 必须实现里面的抽象方法。 因为只有一个抽象方法， 
		 * 可以不使用匿名内部类，转而使用Lambda表达式。
		 * 但是我们又发现， 唯一的抽象方法的实现和Person类的全参构造器有同样的结构（参数、返回值）。
		 * 所以可以用更简单的构造器引用完成。
		 * 
		 * Person有多个构造器， Java自动通过factory唯一抽象方法的参数列表选择对应的合适构造器。
		 */
		
		//lambda表达式写法
		PersonFactory<Person> factory1 = (p,q) -> new Person(p,q);
		PersonFactory<Person> factory2 = (String p, String q) -> new Person(p,q);
		PersonFactory<Person> factory3 = (p,q) -> {return new Person(p,q);};
		

	}
}
