public class Donatur {
    private String nama;
    private double totalZakat;

    public Donatur(String nama) {
        this.nama = nama;
        this.totalZakat = 0;
    }

    public String getNama() {
        return nama;
    }

    public void tambahZakat(double zakat) {
        this.totalZakat += zakat;
    }

    public double getTotalZakat() {
        return totalZakat;
    }

    public String toString() {
        return "Donatur{" +
                "nama='" + nama + '\'' +
                ", totalZakat=" + totalZakat +
                '}';
    }
}
