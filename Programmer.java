/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.pertemuan.pkg9;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Programmer extends Pegawai{

    protected double bonus;

    public Programmer(String nama, double gajiPokok, double bonus){
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    // SETTER
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    // GETTER
    public double getBonus(){
        return bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakBonus();
    }

    public void cetakBonus(){
        setNama("Dwi Aditya Budi Listiawan");
        setGajiPokok(4000000);
        setBonus(1200000);

        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Bonus: " + getBonus());
    }
}
