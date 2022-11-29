import java.util.Scanner;

public class TP01 {
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int jumlah = input.nextInt();
		int amoeba = 30;
		int waktu = 0;

		while (amoeba < jumlah) {
			amoeba *=2;
			waktu += 15;
		}
		System.out.println(waktu);
		input.close();
	}
}
