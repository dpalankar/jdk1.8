package com.jdk;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Java Stream
 * Functional Interfaces in Java 8 Stream
 * Function and BiFunction
 * Predicate and BiPredicate
 * Consumer and BiConsumer
 * Supplier
 * java.util.Optional
 * java.util.Spliterator
 */
public class Java8StreamExample_3 {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();

		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Instant start = Instant.now();
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println("timeElapsed for parallel "+timeElapsed);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Instant start1 = Instant.now();
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		Instant finish1 = Instant.now();
		long timeElapsed1 = Duration.between(start1, finish1).toMillis();  //in millis
		System.out.println("timeElapsed1 for sequence "+timeElapsed1);
		//using lambda in forEach
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
	}

}
