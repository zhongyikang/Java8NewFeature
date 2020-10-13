package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStream {
	
	public static void main(String[] args) {
		
		//初始化
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}
		
		long t0, count, t1, millis;
		
		
		//sequence, single thread
		t0 = System.nanoTime();

		count = values.stream().sorted().count();
		System.out.println(count);

		t1 = System.nanoTime();

		millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));

		// sequential sort took: 899 ms
		
		
		//parallel， 多线程
		t0 = System.nanoTime();

		count = values.parallelStream().sorted().count();
		System.out.println(count);

		t1 = System.nanoTime();

		millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("parallel sort took: %d ms", millis));

		// parallel sort took: 472 ms

		// sequential sort took: 899 ms
	}
}
