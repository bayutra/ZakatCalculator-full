public class ZakatFitrah {
    private double kekayaan;

    public ZakatFitrah(double kekayaan) {
        this.kekayaan = kekayaan;
    }

    public double calculateZakat(int pilihan) {
        double zakat = 0;
        switch (pilihan) {
            case 1: // Beras
                zakat = kekayaan * 0.025; // Contoh perhitungan zakat fitrah dari beras
                break;
            case 2: // Uang
                zakat = kekayaan * 0.025; // Contoh perhitungan zakat fitrah dari uang
                break;
            default:
                System.out.println("Pilihan tidak valid untuk zakat fitrah.");
        }
        return zakat;
    }
}; 
