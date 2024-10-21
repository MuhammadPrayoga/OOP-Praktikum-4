package Pegawai;
public class Pegawai {
    // Atribut
    private String nama;
    private double gajiPokok;

    // Kontruktor
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Gaji Pokok  : " + gajiPokok);
    }
}
