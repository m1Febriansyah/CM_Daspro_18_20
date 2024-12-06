import java.util.Scanner;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
}

public static void menu() {

    System.out.println("======== MENU UTAMA ========");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappucino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("============================");
    System.out.println("Silahkan pilih menu yang anda inginkan");
}

public static double hitungTotalharga20(int pilihanMenu, int jumlahItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 28000};
    double hargaTotal = hargaItems[pilihanMenu - 1] * jumlahItem;

    return hargaTotal;
}

