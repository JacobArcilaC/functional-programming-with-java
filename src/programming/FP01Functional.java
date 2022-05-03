package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
		printSquareOfEvenNumbersInListFunctional(numbers);
		
	}

//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number%2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// What to do?

		numbers.stream().forEach(System.out::println);

//		}
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 0)
			.forEach(System.out::println);
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 0)
			.map(number -> number * number)
			.forEach(System.out::println);
	}


}
