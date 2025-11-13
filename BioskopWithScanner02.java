import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("\nPilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Posisi tidak ada");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah ditempati");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dan akan disimpan");
                }
            } else if (menu == 2) {
                System.out.println("\n--- DAFTAR PENONTON ---");
                System.out.println("Berikut merupakan daftar penonton menurut baris dan kolom!");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih, program selesai.");
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
