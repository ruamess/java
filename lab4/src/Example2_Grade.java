import java.util.Scanner;

public class Example2_Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите балл (0-100): ");
		int score = scanner.nextInt();

		int grade;
		if (score >= 90) {
			grade = 5;
		} else if (score >= 75) {
			grade = 4;
		} else if (score >= 50) {
			grade = 3;
		} else if (score >= 25) {
			grade = 2;
		} else {
			grade = 1;
		}

		System.out.println("Оценка: " + grade);
	}
}
