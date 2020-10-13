# Java8NewFeature

## key work 'default' in interface method

起主要作用是让interface method可以写方法体， 也就是实现。

代码主要内容分为两部分：

1. 含有default的interface Formula.java
2. 这个接口的测试： 如果要让这个接口实现必须实现接口的内部抽象方法。

## Lambda expression

### functional interface（函数式接口）

A so called *functional interface* must contain **exactly one abstract method** declaration. Each lambda expression of that type will be matched to this abstract method.<p>

配合上面的default关键字，一个函数式接口可以由一个抽象方法和多个default方法组成。



可以用`@FunctionalInterface`检验函数式接口的有效性。



## Method and Constructor References



