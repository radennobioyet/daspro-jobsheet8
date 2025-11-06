# JOBSHEET 8
# Percobaan 3


Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sudah sesuai dengan tampilan berikut?
2. Jika belum sesuai, bagian mana saja yang harus diperbaiki/diganti? Jelaskan alasannya.
3. Silakan lakukan commit dan push hasil perbaikan ke repository Anda.



Jawaban
1. Tidak sesuai. Program tidak mencetak baris baru, sehingga semua bintang tercetak dalam satu baris. 
2. 
```
import java.util.Scanner;

public class Triangle20 {
    public static void main(String[] args) {
        
        Scanner rdn = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = rdn.nextInt();

        int i = 0;
        while (i <= N) {
           
            int j = 0;
            while (j < i) {
                System.err.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
```
3. Commit diselesaikan 