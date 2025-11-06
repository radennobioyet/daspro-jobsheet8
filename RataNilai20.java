
import java.util.Scanner;

public class RataNilai20 {
    public static void main(String[] args) {

        Scanner rdn = new Scanner(System.in);

        int i, j;
        double nilaiMhs = 0, totalNilai = 0, rataNilai = 0;

        i = 1;
        while (i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = rdn.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }
        System.out.println(rataNilai);
    }
}
