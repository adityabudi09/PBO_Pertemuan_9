/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.pertemuan.pkg9;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Manager extends Pegawai {
    protected double tunjangan;

    public Manager(String nama, int gajiPokok, int tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakTunjangan();
    }

    public void cetakTunjangan() {
        setNama("Analisa Amelia Putri");
        setGajiPokok(9000000);
        setTunjangan(3000000);

        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + getTunjangan());


    }
}
