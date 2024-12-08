import java.util.Scanner;

public class CMzuhdi {

    public static void menu() {
        System.out.println("======== MENU KAFE ========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Latte - Rp 22,000");
        System.out.println("3. Teh Tarik - Rp 12,000");
        System.out.println("4. Mie Goreng - Rp 18,000");
    }

    public static double hitungTotalharga20(int pilihanMenu, int jumlahItem) {
        int[] hargaItems = { 15000, 22000, 12000, 18000 };
        double hargaTotal = hargaItems[pilihanMenu - 1] * jumlahItem;

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        String[] daftarMenu = { "Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng" };
        do {
            System.out.println("1. tambahkan pesanan");
            System.out.println("2. tampilkan daftar pesanan");
            System.out.println("3. keluar");
            System.out.print("pilih menu : ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {

                double totalKeseluruhan = 0;

                sc.nextLine();
                System.out.print("\nmasukkan nama pelanggan : ");
                String nama = sc.nextLine();
                System.out.print("masukkan nomer meja : ");
                int noMeja = sc.nextInt();
                System.out.println();

                menu();
                while (true) {

                    System.out.print("\npilih nomer menu(masukkan nomer menu, atau 0 untuk selesai): ");
                    int pilihanMenu = sc.nextInt();
                    if (pilihanMenu == 0) {
                        System.out.println("\npesanan berhasil ditambahkan");
                        break;
                    }
                    System.out.print("Masukkan jumlah " + daftarMenu[pilihanMenu - 1] + " yang ingin dipesan: ");
                    int jumlahItem = sc.nextInt();

                    double totalHarga = hitungTotalharga20(pilihanMenu, jumlahItem);
                    totalKeseluruhan += totalHarga;
                }
                System.out.print("Total harga untuk pesanan Anda : Rp" + totalKeseluruhan + "\n");
                System.out.println();

            } else if (pilihan == 2) {



            } else if (pilihan == 3) {
                break;
            }
        } while (true);

    }
}