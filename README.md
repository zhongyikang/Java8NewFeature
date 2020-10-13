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



### 注意

1. lambda可以传入本地变量，但是这个本地变量不可改变。
2. 可以传入field和static field， 且可以在内部改变。
3. lambda表达式无法使用函数式接口的default方法（有方法体的方法）。

## Method and Constructor References



## Built-in Functional Interfaces

内置函数式接口。 

Java8之前已经有了， 例如`Comparator`、`Runnable`， java8也提供了一些函数式接口。

## Stream

Java8扩展了Collection和Collections，可以让他们获取一个Stream， 从而进行流式操作。

有两种流失操作， 终端操作， 中间操作。

中间操作就是操作后返回的是这个流本身。

例如， 通过List A， 获取一个StremA。 StreamA执行filter(), filter()的返回值还是StreamA。

终端操作就是结束流式操作的操作。

例如： count(), 可以计算这个流中的元素数量，返回Integer。 Match， 判断是否符合特定特称， 返回boolean。

 







