import java.util.Scanner;

public class PorseniPolinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoltek = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        int i = 1;
        while (i <= jumlahPoltek) {
            System.out.println("\n=== Politeknik ke-" + i + " ===");
            System.out.print("Masukkan nama Politeknik: ");
            String namaPoltek = sc.nextLine();

            // BADMINTON
            System.out.println("\nCabang: Badminton");
            int j = 1;
            String atletBadminton = "";
            while (j <= 5) {
                System.out.print("Atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                atletBadminton += namaAtlet + "\n";
                j++;
            }

            // TENIS MEJA
            System.out.println("\nCabang: Tenis Meja");
            j = 1;
            String atletTenisMeja = "";
            while (j <= 5) {
                System.out.print("Atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                atletTenisMeja += namaAtlet + "\n";
                j++;
            }

            // BASKET
            System.out.println("\nCabang: Basket");
            j = 1;
            String atletBasket = "";
            while (j <= 5) {
                System.out.print("Atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                atletBasket += namaAtlet + "\n";
                j++;
            }

            // BOLA VOLI
            System.out.println("\nCabang: Bola Voli");
            j = 1;
            String atletVoli = "";
            while (j <= 5) {
                System.out.print("Atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                atletVoli += namaAtlet + "\n";
                j++;
            }

            // === OUTPUT DATA POLITEKNIK ===
            System.out.println("\n----------------------------------------");
            System.out.println("Data Atlet Politeknik: " + namaPoltek);
            System.out.println("----------------------------------------");

            System.out.println("\nCabang: Badminton");
            System.out.print(atletBadminton);

            System.out.println("\nCabang: Tenis Meja");
            System.out.print(atletTenisMeja);

            System.out.println("\nCabang: Basket");
            System.out.print(atletBasket);

            System.out.println("\nCabang: Bola Voli");
            System.out.print(atletVoli);

            System.out.println("----------------------------------------\n");

            i++;
        }

        System.out.println("=== Semua data telah berhasil dimasukkan dan ditampilkan ===");
        sc.close();
    }
}
