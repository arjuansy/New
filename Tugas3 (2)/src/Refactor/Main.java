package Refactor;

/**
 * Kelas Main merupakan titik awal (entry point) dari program simulasi pertarungan Pokemon.
 *
 * <p>Program ini membuat beberapa objek Pokemon, menampilkan informasinya,
 * dan menjalankan pertarungan menggunakan kelas Battle.</p>
 *
 * @author arjuansy
 * @version 1.1
 */
public class Main {
    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Listrik", 85);
        Pokemon charmander = new Pokemon("Charmander", "Api", 78);

        pikachu.displayInfo();
        charmander.displayInfo();

        Battle battle = new Battle();
        battle.mulaiPertarungan(pikachu, charmander);
    }
}
