/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo.pertemuan.pkg9;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Front End Developers", 7000000, 2000000);
        Programmer programmer = new Programmer("Back End Developers", 8000000, 2500000);

        System.out.println("===== TUGAS PBO PERTEMUAN 9 =====");

        System.out.println("============ MANAGER ===========");
        System.out.println("Nama         : " + manager.nama);
        System.out.println("Gaji Pokok   : " + manager.gajiPokok);
        System.out.println("Tunjangan    : " + manager.tunjangan);

        System.out.println();

        System.out.println("========== PROGRAMMER ==========");
        System.out.println("Nama         : " + programmer.nama);
        System.out.println("Gaji Pokok   : " + programmer.gajiPokok);
        System.out.println("Bonus        : " + programmer.bonus);

    }
}