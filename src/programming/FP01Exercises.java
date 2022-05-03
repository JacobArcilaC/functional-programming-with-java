package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP01Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker", "Azure","Kubernetes");
//		printOddNumbersInListFunctional(numbers);
//		printAllCoursesInListFunctional(courses);
//		printSpringCoursesInListFunctional(courses);
//		printCoursesWith4OrMoreLettersInListFunctional(courses);
//		printCubesOfOddNumbersInListFunctional(numbers);
//		printAllCoursesWithLengthInListFunctional(courses);
		System.out.println(collectEvenNumbersInListFunctional(numbers));
		System.out.println(doubleListOfCourseLength(courses));
		
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

	// Exercise 1
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

	// Exercise 2
	private static void printAllCoursesInListFunctional(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}

	// Exercise 3
	private static void printSpringCoursesInListFunctional(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}

	// Exercise 4
	private static void printCoursesWith4OrMoreLettersInListFunctional(List<String> courses) {
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
	}

	// Exercise 5
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number)
				.forEach(System.out::println);
	}

	// Exercise 6
	private static void printAllCoursesWithLengthInListFunctional(List<String> courses) {
		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
	}

	// Exercise 7
	private static void sumSquareAllNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
	}
	
	//Exercise 8
	private static void sumCubesAllNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum);
	}
	
	//Exercise 9
	private static void sumOddNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum);
	}
	
	//Using comparators with sorted
	private static void sortCoursesByLengthInListFunctional(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}
	
	//Exercise 10
	private static List<Integer> collectEvenNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
	}
	
	//Exercise 11
	private static List<Integer> doubleListOfCourseLength(List<String> courses) {
		return courses.stream().map(course -> course.length()).collect(Collectors.toList());
	}
	
	//The operations that you can perform on a stream can be categorized in two varities intermediate and terminal operations
	
	//Exercise 12
	private static void findFunctionalInterface(List<Integer> numbers) {
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer acumulator, Integer number) {
				return acumulator + number;
			}
			
		};
		numbers.stream().reduce(0, accumulator);
	}
	
	//Exercise 13
	private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
		return numbers.stream().map(mappingFunction).collect(Collectors.toList());
	}
}
