import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		double radioaktif = input.nextDouble();
		int jumlahhari = input.nextInt();
		jumlahhari = jumlahhari / 10;
		int hari = 0;

		while(hari < jumlahhari) {
			radioaktif = radioaktif/2;
			hari++;
		}
		System.out.printf("%.3f", radioaktif);
	}
}
