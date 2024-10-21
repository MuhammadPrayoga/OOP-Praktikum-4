package Pegawai;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Yoga", 8000000, 2000000);
        Programmer programmer = new Programmer("Faudzi", 5000000, 1000000);

        manager.cetakInfo();
        programmer.cetakInfo();
    }
}