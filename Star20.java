import java.util.Scanner;

public class Star20 {
    public static void main(String[] args) {
        
        Scanner rdn = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai N = ");
        int N = rdn.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }
}