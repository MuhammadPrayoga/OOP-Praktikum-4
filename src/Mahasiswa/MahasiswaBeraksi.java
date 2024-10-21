package Mahasiswa;
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan menggunakan konstruktor
        Mahasiswa anton = new Mahasiswa("Anton", "Laki-Laki", 20, "Bekasi", "312310569", "Informatika");

        // Memanggil metode untuk mencetak informasi
        anton.cetakInfo();
        System.out.println("NIM             : " + anton.getNim());
        System.out.println("Jurusan         : " + anton.getJurusan());
    }
}