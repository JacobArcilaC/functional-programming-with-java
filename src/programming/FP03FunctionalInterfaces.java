package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

	/*
	 * boolean isEven(int x){ return x%2 == 0; }
	 * 
	 * int squared(int x){ return x * x; }
	 * 
	 * void println(int x){ System.out.println(x); }
	 */

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);
		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				return x % 2 == 0;
			}

		};

		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}

		};

		Consumer<Integer> action = System.out::println;

		numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(action);
	}

}
