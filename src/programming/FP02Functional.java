package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);
		List<Integer> doubledNumbers = doubleList(numbers);

		System.out.println(doubledNumbers);

//		int sum = addListFunctional(numbers);
//		System.out.println(sum);
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()
				// .reduce(0, FP02Functional::sum);
				// .reduce(0, (x, y) -> x + y);
				.reduce(0, Integer::sum);
	}

}
