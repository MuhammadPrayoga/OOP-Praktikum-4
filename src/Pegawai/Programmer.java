package Pegawai;
public class Programmer extends Pegawai {
    private double bonus;

    // Konstruktor
    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok); 
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void cetakInfo() {
        super.cetakInfo(); // Memanggil parent cetakInfo()
        System.out.println("Bonus       : " + bonus);
    }

    public void cetakBonus() {
        System.out.println("Bonus       : " + bonus);
    }
}
