import java.util.Scanner;

public class Example5_EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " — чётное число");
		} else {
			System.out.println(num + " — нечётное число");
		}
	}
}
