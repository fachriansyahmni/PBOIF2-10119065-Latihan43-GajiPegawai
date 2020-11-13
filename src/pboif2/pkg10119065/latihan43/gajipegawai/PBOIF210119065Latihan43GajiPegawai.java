package pboif2.pkg10119065.latihan43.gajipegawai;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Gaji Pegawai 
 *                         dengan objek
 */
public class PBOIF210119065Latihan43GajiPegawai {
    
    public static void main(String[] args) {
        GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setNama("Ijul");
        gajiPegawai.setAlamat("Jalan pajajaran 1 no 122");
        gajiPegawai.setUangtransport(250000);
        gajiPegawai.setUangtunjangan(300000);
        gajiPegawai.setGajipokok(4500000);
        gajiPegawai.tampilData(gajiPegawai.getNama(), gajiPegawai.getAlamat(), gajiPegawai.getUangtunjangan(), 
                gajiPegawai.getUangtransport(), gajiPegawai.getGajipokok(), gajiPegawai.getTotalgaji());
    }
    
}
