public class Penerima {
    private String nama;
    private String alamat;

    public Penerima(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String toString() {
        return "Penerima{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
