import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		double bilangan = 0;
		double total = 0;
		double i = 0;

		while ((bilangan = input.nextDouble())!= 0){
			total += bilangan;
			i++;
		}
		total = total / i;
		System.out.printf("%.2f", total);
	}
}