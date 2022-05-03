package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03BehaviorParameterization {

	/*
	 * boolean isEven(int x){ return x%2 == 0; }
	 * 
	 * int squared(int x){ return x * x; }
	 * 
	 * void println(int x){ System.out.println(x); }
	 */

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);
		
		filterAndPrint(numbers, x -> x%2==0);
		
	}
	
	public static void filterAndPrint(List<Integer> numbers, Predicate<Integer> filterPredicate) {
		numbers.stream().filter(filterPredicate).forEach(System.out::println);
	}

}
