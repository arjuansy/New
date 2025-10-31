package Refactor;

/**
 * Kelas Battle digunakan untuk mengatur simulasi pertarungan antar dua Pokemon.
 *
 * <p>Hasil pertarungan ditentukan berdasarkan nilai kekuatan masing-masing Pokemon.</p>
 *
 * @author arjuansy
 * @version 1.1
 */
public class Battle {

    /**
     * Memulai pertarungan antara dua Pokemon.
     *
     * @param p1 Pokemon pertama.
     * @param p2 Pokemon kedua.
     */
    public void mulaiPertarungan(Pokemon p1, Pokemon p2) {
        System.out.println("=== Pertarungan Dimulai! ===");
        System.out.println(p1.getNama() + " vs " + p2.getNama());

        if (p1.getKekuatan() > p2.getKekuatan()) {
            tampilkanPemenang(p1);
        } else if (p1.getKekuatan() < p2.getKekuatan()) {
            tampilkanPemenang(p2);
        } else {
            System.out.println("Pertarungan seri!");
        }
    }

    /**
     * Menampilkan hasil pertarungan dan pemenangnya.
     *
     * @param pemenang Pokemon yang memenangkan pertarungan.
     */
    private void tampilkanPemenang(Pokemon pemenang) {
        System.out.println("Pemenang adalah: " + pemenang.getNama());
        System.out.println("=============================");
    }
}
