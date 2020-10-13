package com.DefaultMethodOfInterface;

public class FormulaTest {
	public static void main(String[] args) {
		
		//要想得到一个concret类， 必须实现接口未实现的方法
		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
			
		};
		
		double d = formula.calculate(5);
		System.out.println(d);
	}
}
