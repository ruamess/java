public class Task4_EvenContinue {
	public static void main(String[] args) {
		System.out.println("Чётные числа от 1 до 100:");

		int i = 0;
		while (i < 100) {
			i++;
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
