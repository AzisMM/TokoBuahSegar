package com.azis.unpam.java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kodebuah, namabuah;
        int jumlah, bayar, diskon, total;
        int harga = 0;
        int h_anggur = 47000, h_jeruk = 30000, h_melon = 20000;

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        //Membuat Simbol Rupiah
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        // Daftar Buah
        System.out.println("Nomor  ||  Kode  ||  Nama Buah  ||   Harga/KG");
        System.out.println("===============================================");
        System.out.println("1.     ||  AG    ||  Anggur     ||   Rp. 47.000");
        System.out.println("2.     ||  JR    ||  Jeruk      ||   Rp. 30.000");
        System.out.println("3.     ||  ME    ||  Melon      ||   RP. 20.000");
        System.out.println("===============================================");

        System.out.println("Toko Buah \"SEGAR\" ");
        System.out.println("==================================");

        //input
        System.out.print("Kode Buah             : ");
        kodebuah = input.nextLine();

        if (kodebuah.equals("AG")) {
            namabuah = "Anggur";
            harga = harga + h_anggur;
        }else if(kodebuah.equals("JR")){
            namabuah = "Jeruk";
            harga = harga + h_jeruk;
        }else if(kodebuah.equals("ME")){
            namabuah = "Melon";
            harga = harga + h_melon;
        }else{
            namabuah = "Kode Tidak Ditemukan";
        }

        System.out.println("Nama Buah             : " + namabuah);

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.printf("Harga/kg              : %s %n", kursIndonesia.format(harga));


        System.out.print("Jumlah Beli(kg)       : ");
        jumlah = input1.nextInt();

        bayar = harga * jumlah;
        System.out.printf("Bayar                : %s %n", kursIndonesia.format(bayar));

        //Menghitung Diskon
        if(bayar >= 300000){
            diskon = bayar * 10 / 100 ;
        }else {
            diskon = 0;
        }
        System.out.printf("Diskon               : %s %n", kursIndonesia.format(diskon));
        System.out.println("===================================");

        //Menghitung Total Bayar
        total = bayar - diskon;
        System.out.printf("Total Bayar          : %s %n", kursIndonesia.format(total));

    }
}
