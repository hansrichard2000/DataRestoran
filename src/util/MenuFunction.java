package util;

import java.util.ArrayList;
import java.util.Arrays;

import model.Menu;

public class MenuFunction {

    ArrayList<Menu> menuArrayList = new ArrayList<Menu>(
        Arrays.asList(
            new Menu("Nasi Goreng", 20000),
            new Menu("Nasi Bakar", 15000),
            new Menu("Es Teh Manis", 7000),
            new Menu("Aqua Botol", 5000)
        ));


    public void showMenu() {
        System.out.println("");
        System.out.println("=========================");
        System.out.println("|||Daftar Menu MyResto|||");
        System.out.println("=========================");
        
        if (menuArrayList.isEmpty()) {
            System.out.println("Data Menu Kosong");
        }else{
            for(int i = 0; i < menuArrayList.size(); i++){
                Menu menuList = menuArrayList.get(i);
                System.out.println((i+1) + ". " + menuList.getMenuName() + " "+menuList.getMenuPrice());
            }
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("");
    }

    public void addOrder() {
        String menuName = InputFunction.getStringInput("-> Masukkan nama menu: ");
        int menuPrice = InputFunction.getIntegerInput("-> Masukkan harga menu: ");
        menuArrayList.add(new Menu(menuName, menuPrice));
        System.out.println();
    }

    public void updateOrder() {
        showMenu();
        if (!menuArrayList.isEmpty()) {
            int nomor = InputFunction.getIntegerInput("--> Update nomor berapa? ");
            if (nomor - 1 > menuArrayList.size() && nomor - 1 < 0) {
                System.out.println("(-) INPUTAN TIDAK SESUAI DENGAN DATA YANG EXIST (-)");
            } else {
                String newMenuName = InputFunction.getStringInput("-> Nama Menu yang baru: ");
                int newMenuPrice = InputFunction.getIntegerInput("Harga menu yang baru: ");
                menuArrayList.get(nomor-1).setMenuName(newMenuName);
                menuArrayList.get(nomor-1).setMenuPrice(newMenuPrice);
            }
        }
        System.out.println();
    }

    public void deleteOrder() {
        showMenu();
        if (!menuArrayList.isEmpty()) {
            int nomor = InputFunction.getIntegerInput("--> Hapus nomor berapa? ");
            if (nomor - 1 > menuArrayList.size() && nomor - 1 < 0) {
                System.out.println("(-) INPUTAN TIDAK SESUAI DENGAN DATA YANG EXIST (-)");
            } else {
                menuArrayList.remove(nomor - 1);
            }
        }
        System.out.println("");
    }

    
}
