import java.util.Scanner;

public class TP03 {
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 1;
		while (b != 0) {
			b = input.nextInt();
			a = a + b;
		}
		System.out.println(a);
		input.close();
	}
}
