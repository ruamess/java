import java.util.Scanner;

public class Example1_PosNegZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите целое число: ");
		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println("Число " + num + " — положительное");
		} else if (num < 0) {
			System.out.println("Число " + num + " — отрицательное");
		} else {
			System.out.println("Число равно нулю");
		}
	}
}
