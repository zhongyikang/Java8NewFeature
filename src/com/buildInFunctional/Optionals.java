package com.buildInFunctional;

import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("bam");
		
		optional.isPresent();           // true, 为null则返回false
		optional.get();                 // "bam",如果是null， 则抛出异常
		optional.orElse("fallback");    // "bam"，如果value是null， 返回fallback。 否则，返回value
		
		optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
		
		/**
		 * Optional是java Strem的核心概念。
		 * 可以理解为对于一个可能为null对象的封装。
		 * of方法， get方法，如果是null， 都会抛出异常。
		 */
	}
}
