import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ZakatCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        List<Donatur> donaturList = new ArrayList<>();

        double totalZakat = 0;
        int jenisZakat;
        int pilihan;

        System.out.println("Selamat Datang di Kalkulator Zakat!");
        System.out.println("-------------------------------");

        System.out.print("Masukkan nama donatur: ");
        String namaDonatur = scanner.nextLine();
        Donatur donatur = new Donatur(namaDonatur);
        donaturList.add(donatur);

        while (true) {
            System.out.println("Pilih jenis zakat:");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Mall");
            System.out.println("3. Keluar");

            try {
                jenisZakat = scanner.nextInt();

                if (jenisZakat == 3) {
                    break;
                } else if (jenisZakat < 1 || jenisZakat > 3) {
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
                }

                System.out.print("Masukkan jumlah kekayaan: ");
                double kekayaan = scanner.nextDouble();

                if (jenisZakat == 1) {
                    System.out.println("Pilih jenis zakat fitrah:");
                    System.out.println("1. Beras");
                    System.out.println("2. Uang");
                    pilihan = scanner.nextInt();

                    ZakatFitrah zakatFitrah = new ZakatFitrah(kekayaan);
                    double zakat = zakatFitrah.calculateZakat(pilihan);
                    System.out.println("Anda membayar zakat fitrah sebesar: Rp" + decimalFormat.format(zakat));
                    totalZakat += zakat;
                    donatur.tambahZakat(zakat);

                } else if (jenisZakat == 2) {
                    System.out.println("Pilih jenis zakat mall:");
                    System.out.println("1. Emas");
                    System.out.println("2. Pertanian");
                    System.out.println("3. Peternakan");
                    System.out.println("4. Pendapatan");
                    pilihan = scanner.nextInt();

                    ZakatMall zakatMall = new ZakatMall(kekayaan);
                    double zakat = zakatMall.calculateZakat(pilihan);
                    System.out.println("Anda membayar zakat mall sebesar: Rp" + decimalFormat.format(zakat));
                    totalZakat += zakat;
                    donatur.tambahZakat(zakat);
                }

                System.out.print("Apakah Anda ingin menghitung zakat lagi? (1 = Ya, 2 = Tidak): ");
                int ulang = scanner.nextInt();
                if (ulang == 2) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silahkan masukkan angka yang benar.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Total zakat yang dibayarkan: Rp" + decimalFormat.format(totalZakat));
        System.out.println("Total zakat yang diberikan oleh " + donatur.getNama() + ": Rp" + decimalFormat.format(donatur.getTotalZakat()));
        System.out.println("Terima kasih telah menggunakan Kalkulator Zakat!");
        scanner.close();
    }
}