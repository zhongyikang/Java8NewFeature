package com.MethodAndConstructorReferences;

import com.lambda.Converter;

public class ConverterTest1 {
	public static void main(String[] args) {
		Converter<String, Integer> converter = Integer::valueOf;
		/**
		 * Integer是一个接口。
		 * valueOf是一个方法。
		 * 
		 * valueOf和converter.convert有一样的结构。
		 * Integer valueOf(String);
		 * Integer convert(String);
		 * 
		 * 所以， 调用convert的时候，直接把参数传给valueOf， 把得到的返回值返回。
		 * 
		 * args --- [convert] --- [valueOf] ---处理--- returnVal --- [convert]---返回
		 */
		
		
		int num = 1; //local variable, can't be changed after initing.
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);
		//num = 3;
	}
}
