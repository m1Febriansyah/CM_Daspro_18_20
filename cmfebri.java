import java.util.Scanner;

public class cmfebri {

    public static void menu() {
        System.out.println("======== MENU KAFE ========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Latte - Rp 22,000");
        System.out.println("3. Teh Tarik - Rp 12,000");
        System.out.println("4. Mie Goreng - Rp 18,000");
    }

    public static void menuUtama() {
        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Tambahkan Pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static double hitungTotalharga20(int pilihanMenu, int jumlahItem) {
        int[] hargaItems = { 15000, 22000, 12000, 18000 };
        double hargaTotal = hargaItems[pilihanMenu - 1] * jumlahItem;

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftarMenu = { "Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng" };
        boolean adaPesanan = false;
        String pesanan = "";
        String detailPesanan;

        while (true) {
            menuUtama();
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                double totalKeseluruhan = 0;
                sc.nextLine();
                System.out.print("\nmasukkan nama pelanggan : ");
                String nama = sc.nextLine();
                System.out.print("masukkan nomer meja : ");
                int noMeja = sc.nextInt();
                System.out.println();

                detailPesanan = "Nama Pelanggan: " + nama + "\nNomor Meja: " + noMeja + "\nDetail Pesanan:\n";

                menu();

                while (true) {

                    System.out.print("\npilih nomer menu(masukkan nomer menu, atau 0 untuk selesai): ");
                    int pilihanMenu = sc.nextInt();
                    if (pilihanMenu == 0) {
                        System.out.println("\npesanan berhasil ditambahkan");
                        break;
                    }

                    adaPesanan = true;

                    System.out.print("Masukkan jumlah " + daftarMenu[pilihanMenu - 1] + " yang ingin dipesan: ");
                    int jumlahItem = sc.nextInt();

                    double totalHarga = hitungTotalharga20(pilihanMenu, jumlahItem);
                    totalKeseluruhan += totalHarga;
                    detailPesanan += "- " + daftarMenu[pilihanMenu - 1] + " x " + jumlahItem + " = Rp " + totalHarga + "\n";
                }
                System.out.print("Total harga untuk pesanan Anda : Rp" + totalKeseluruhan + "\n");

                detailPesanan += "Total Harga Pesanan: Rp " + totalKeseluruhan + "\n---------------------------\n";

                pesanan += detailPesanan;

            } else if (pilihan == 2) {

                if (adaPesanan) {
                    System.out.println("\n===== DAFTAR PESANAN ======");
                    System.out.println(pesanan );
                
                } else {
                    System.out.println("Belum ada pesanan yang ditambahkan.");
                }

            } else if (pilihan == 3) {
                break;
            }
        }

    }
}