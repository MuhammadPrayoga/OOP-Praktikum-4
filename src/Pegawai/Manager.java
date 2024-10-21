package Pegawai;
public class Manager extends Pegawai {
    private double tunjangan;

    // Konstruktor 
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Setter dan Getter
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void cetakInfo() {
        super.cetakInfo(); // Memanggil parent cetakInfo()
        System.out.println("Tunjangan   : " + tunjangan);
    }

    public void cetakTunjangan() {
        System.out.println("Tunjangan   : " + tunjangan);
    }
}
