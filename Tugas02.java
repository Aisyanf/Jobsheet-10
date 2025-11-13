import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pernyataan = 6;
        int [] [] survei = new int [responden] [pernyataan];

        System.out.println("Input Hasil Survei Kepuasan Pelanggan");
        for (int i = 0; i < responden; i++) {
            System.out.println("\n Responden ke-" +(i+1));
            for (int j = 0; j < pernyataan; j++) {
                do {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    survei[i][j] = sc.nextInt();
                    if (survei[i][j] < 1 || survei [i][j] > 5) {
                        System.out.println("Nilai harus antara 1 sampai 5!");
                    }
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
        }

        System.out.println("Rata rata tiap responden : ");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pernyataan; j++) {
                total += survei [i] [j];
            }
            double rataResponden = total/pernyataan;
            System.out.println("Responden " +(i+1) +" : " +rataResponden);
        }

        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < pernyataan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survei[i][j];
            }
            double rataPertanyaan = total / responden;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rataPertanyaan);
    }
    double totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pernyataan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (responden * pernyataan);
        System.out.println("\nRata-rata keseluruhan : " + rataKeseluruhan);
    }
}