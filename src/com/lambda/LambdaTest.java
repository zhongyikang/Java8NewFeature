package com.lambda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		//实现对叫做names的list的排序
		
		
		//1.普通方法
		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return b.compareTo(a);
		    }
		});
		
		//2.lambda1
		Collections.sort(names, (String a, String b)/*参数*/ -> {
		    return b.compareTo(a);/*方法体*/
		});
		
		//3. lamebda2
		Collections.sort(names, (String a, String b) -> b.compareTo(a)/*删除了方法体的大括号和return关键字*/);
		
		//4. lamebda3
		Collections.sort(names, (a, b)/*删除了参数的类型信息*/ -> b.compareTo(a));
		
		
		/**
		 * 思考： lambda表达式的运行原理！
		 * 执行sort的时候， 会匹配参数， 从而得到第二个参数是Comparator。
		 * 函数式方法的特点是： 一个接口中只有一个方法。所以通过传入的参数直接定位唯一的方法。
		 * 再次定位参数，不需要类型信息，因为根据前面List中数据的类型自动匹配。
		 * 因为只有一条执行语句，所以它一定是返回内容，所以也省了return关键字。
		 */
		
	}
}
