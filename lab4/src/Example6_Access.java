import java.util.Scanner;

public class Example6_Access {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите ваш возраст: ");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Доступ разрешён");
		} else {
			System.out.println("Доступ запрещён. Вам должно быть не менее 18 лет.");
		}
	}
}
