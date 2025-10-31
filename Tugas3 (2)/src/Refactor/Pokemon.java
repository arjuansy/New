package Refactor;

/**
 * Kelas Pokemon merepresentasikan karakter Pokemon dengan atribut dasar seperti nama, tipe, dan kekuatan.
 *
 * <p>Kelas ini digunakan untuk menampilkan informasi Pokemon dan mendukung simulasi pertarungan.</p>
 *
 * @author arjuansy
 * @version 1.1
 */
public class Pokemon {
    private String nama;
    private String tipe;
    private int kekuatan;

    /**
     * Konstruktor untuk membuat objek Pokemon baru.
     *
     * @param nama Nama Pokemon.
     * @param tipe Jenis elemen Pokemon (contoh: Api, Listrik, Air).
     * @param kekuatan Nilai kekuatan dari Pokemon.
     */
    public Pokemon(String nama, String tipe, int kekuatan) {
        this.nama = nama;
        this.tipe = tipe;
        this.kekuatan = kekuatan;
    }

    /**
     * Menampilkan informasi lengkap tentang Pokemon ke layar.
     */
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tipe: " + tipe);
        System.out.println("Kekuatan: " + kekuatan);
        System.out.println("---------------------------");
    }

    /**
     * Mengambil nama Pokemon.
     *
     * @return nama Pokemon.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil kekuatan Pokemon.
     *
     * @return nilai kekuatan Pokemon.
     */
    public int getKekuatan() {
        return kekuatan;
    }
}
