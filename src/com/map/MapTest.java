package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
		    map.putIfAbsent(i, "val" + i); //如果没有对应的key， put
		}

		map.forEach((id, val) -> System.out.println(val));
		//传入一个Consumer， 这个Consumer可以接受两个参数， 叫做BiConsumer。
		
		//lambda表达式可以传入local variable，但是初始化后lv就不能修改了。
		

		//compute: 添加了验证操作，保证key不为null。
		map.computeIfPresent(3, (key, val) -> val + key); //value = value + key
		System.out.println(map.get(3));            // val33
		

		
		/**
		 * Map不支持Stream，但是Java8后提供了有用的方法。
		 * 例如上面的putIfAbstent， forEach。
		 */
	}
}
