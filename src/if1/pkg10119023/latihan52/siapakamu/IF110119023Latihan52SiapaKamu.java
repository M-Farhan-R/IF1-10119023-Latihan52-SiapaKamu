package if1.pkg10119023.latihan52.siapakamu;
/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program identitas
 *
 */
public class IF110119023Latihan52SiapaKamu {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();

        d.setNama("Rizky Adam Kurniawan");
        d.setNip("41227829930");
        d.setUmur(27);
        d.setMataKuliah("PBO");

        m.setNama("Nindi");
        m.setNim("10110269");
        m.setUmur(17);
        m.setKelas("PBO2");

        System.out.println("NIP DOSEN : "+d.getNip());
        d.siapaKamu();
        d.mengajarApa();

        System.out.println();
        
        System.out.println("NIM MAHASISWA : "+m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }
}
