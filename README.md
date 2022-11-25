# PBO_Pertemuan_9
Tugas PBO Pertemuan 9
Saya membuat project ini dengan menggunakan Apche NetBeans IDE 15 dan membuat 4 file java Class dengan salah satu diantaranya adalah Main.java sebagai Class utama. Pada Project kali ini saya akan membuat sebuah Program Constructor dengan struktur java class sebagai berikut :/

            - Main.java           (Main Class)
            - Pegawai.java  
            - Manager.java    
            - Programmer.java 


Setelah ini saya mulai menulis baris code untuk class Pegawai.Java terlebih dahulu sebagai berikut:

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


Setelah saya membuat fungsi di class Manager.java dan Programmer.java, 

- Manager.java

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
- Programmer.java


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


Dan di akhir kita hanya membuat objek di class Main atau file utama kita, sehingga program kita bisa di jalankan dan mengeluarkan output. Sehingga full code Main.java akan menjadi sebagi berikut,

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

Maka jika Program di Run hasil output yang dikeluarkan akan menjadi seperti gambar di bawah ini,
![image](https://user-images.githubusercontent.com/115923969/203916896-ca4cdb84-084e-4d9f-9022-72bf4d046925.png)


