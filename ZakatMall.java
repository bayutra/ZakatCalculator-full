public class ZakatMall {
    private double kekayaan;

    public ZakatMall(double kekayaan) {
        this.kekayaan = kekayaan;
    }

    public double calculateZakat(int pilihan) {
        double zakat = 0;
        switch (pilihan) {
            case 1: // Emas
                zakat = kekayaan * 0.025; // Contoh perhitungan zakat mall dari emas
                break;
            case 2: // Pertanian
                zakat = kekayaan * 0.10; // Contoh perhitungan zakat mall dari pertanian
                break;
            case 3: // Peternakan
                zakat = kekayaan * 0.10; // Contoh perhitungan zakat mall dari peternakan
                break;
            case 4: // Pendapatan
                zakat = kekayaan * 0.025; // Contoh perhitungan zakat mall dari pendapatan
                break;
            default:
                System.out.println("Pilihan tidak valid untuk zakat mall.");
        }
        return zakat;
    }
}