import java.util.Scanner;

public class DosenMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen04 listDosen = new DataDosen04();
        int pilihan;

        do {
            System.out.println("\n=== MENU PENGELOLAAN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Dosen ---");
                    System.out.print("Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen04 dosenBaru = new Dosen04(kode, nama, jk, usia);
                    listDosen.tambah(dosenBaru);
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    listDosen.tampil();
                    break;
                case 3:
                    System.out.println("\n--- Data Dosen Terurut (Usia Termuda -> Tertua) ---");
                    listDosen.SortingASC();
                    listDosen.tampil();
                    break;
                case 4:
                    System.out.println("\n--- Data Dosen Terurut (Usia Tertua -> Termuda) ---");
                    listDosen.sortingDSC();
                    listDosen.tampil();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}