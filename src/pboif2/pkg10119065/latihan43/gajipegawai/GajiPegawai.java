package pboif2.pkg10119065.latihan43.gajipegawai;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Gaji Pegawai 
 *                         dengan objek
 */
public class GajiPegawai {
    private String nama,alamat;
    private int uangTransport,uangTunjangan,gajiPokok,totalGaji;
    
    public String getNama()
    {
        return nama;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public String getAlamat()
    {
        return alamat;
    }
    public void setAlamat(String alamat)
    {
        this.alamat = alamat;
    }
    public int getUangtransport() {
        return uangTransport;
    }

    public void setUangtransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangtunjangan() {
        return uangTunjangan;
    }

    public void setUangtunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajipokok() {
        return gajiPokok;
    }

    public void setGajipokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public int getTotalgaji() {
        return uangTunjangan + uangTransport + totalGaji;
    }

    public void setTotalgaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok,
            int totalGaji)
    {
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Uang Transport : " + uangTransport);
        System.out.println("Uang Tunjangan : " + uangTunjangan);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Total Gaji : " + (totalGaji+gajiPokok));
        
    }
}
