package view;

import java.util.Scanner;

import util.MenuFunction;

public class MyResto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MenuFunction menuFunction = new MenuFunction();

        while (true) {
            System.out.println("||||||SELAMAT DATANG||||||");
            System.out.println("========:My Resto:========");
            System.out.println("==========================");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Tambah Pesanan");
            System.out.println("3. Update Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Keluar");
            System.out.println("|========================|");
            System.out.print("->Pilihan menu : ");
            int pilih = scan.nextInt();
            if (pilih == 1) {
                menuFunction.showMenu();
            } else if (pilih == 2) {
                menuFunction.addOrder();
            } else if (pilih == 3) {
                menuFunction.updateOrder();
            } else if (pilih == 4) {
                menuFunction.deleteOrder();
            } else if (pilih == 5) {
                break;
            }
        }
        scan.close();
    }

    private static void menuListView() {
        System.out.println("");
        System.out.println("=========================");
        System.out.println("|||Daftar Menu MyResto|||");
        System.out.println("=========================");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Bakar");
        System.out.println("3. Es Teh Manis");
        System.out.println("4. Aqua Botol");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("");
    }
}
