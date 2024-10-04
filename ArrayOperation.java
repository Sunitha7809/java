package workshop;

public class ArrayOperation {

	public static void main(String[] args) {

		// get the sum of array elements
		int numbers[] = { 2, 4, 6, 8, 9 };
		int sum = 0;
		for (int index = 0; index < numbers.length; index++) {
			sum = sum + numbers[index];

		}
		System.out.println("sum is:" + sum);
//even and odd //if condition
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] % 2 == 0) {
				System.out.println("it is even numbers");
			} else {
				System.out.println("it is odd numbers");

			}
		}
	}
}
