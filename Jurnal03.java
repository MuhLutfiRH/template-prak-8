import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
        int bilangan1 = sc.nextInt();
        int count = countDigit(bilangan1);

        int hasil;
        String jawaban;
        switch (count) {
            case 1 :
            hasil = faktorial(bilangan1);
            if (hasil == bilangan1) {
                jawaban = "YA";
            } else {
                jawaban = "BUKAN";
            }
            System.out.println(jawaban); 
            break;
            
            case 2 :
            hasil = bilanganada2(bilangan1);
            if (hasil == bilangan1) {
                jawaban = "YA";
            } else {
                jawaban = "BUKAN";
            }
            System.out.println(jawaban);
            break;

            case 3 :
            hasil = bilanganada3(bilangan1);
            if (hasil == bilangan1) {
                jawaban = "YA";
            } else {
                jawaban = "BUKAN";
            }
            System.out.println(jawaban);
            break;
        }
    }
    private static int faktorial(int bilangan) {
        if (bilangan == 0) {
            return 1;
        }
        return bilangan * faktorial(bilangan - 1);
    }
    private static int countDigit(int angka)
    {
        int i = 0;
        while (angka != 0) {
            angka = angka / 10;
            i++;
        }
        return i;
    }
    private static int bilanganada3(int bilangan1){
        int ratusan = bilangan1 / 100;
        int puluhan = (bilangan1 % 100) / 10;
        int satuan = (bilangan1 % 10);
        
        ratusan = faktorial(ratusan);
        puluhan = faktorial(puluhan);
        satuan = faktorial(satuan);

        return ratusan + puluhan + satuan;
    }
    private static int bilanganada2(int bilangan1){
        int puluhan = bilangan1 % 10;
        int satuan = bilangan1 / 10;
        
        puluhan = faktorial(puluhan);
        satuan = faktorial(satuan);

        return puluhan + satuan;
    }
}
