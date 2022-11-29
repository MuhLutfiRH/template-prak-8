import java.util.Scanner;

public class TP02 {
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = 0;

		while (a != 0) {
			b = b *10;
			b = b + a % 10;
			a = a / 10;
		}
		System.out.println(b);
		input.close();
	}
}
