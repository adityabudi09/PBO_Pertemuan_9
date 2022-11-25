/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.pertemuan.pkg9;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    public Pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getNama(){
        return nama;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }

    public void cetakInfo(){}
}
