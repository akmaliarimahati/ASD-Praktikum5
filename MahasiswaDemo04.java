import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
        int jumMhs = 5;
        // Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
        // Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
        // Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
        // Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
        // Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("----- Input Data Mahasiswa ------");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        // melakukan pencarian data menggunakan sequential search
        // System.out.println("\n----------------------------------------------");
        // System.out.println("Pencarian Data");
        // System.out.println("----------------------------------------------");
        // System.out.println("Masukkan IPK Mahasiswa Yang Dicari: ");
        // System.out.print("IPK: ");
        // double cari = sc.nextDouble();

        // System.out.println("\nMenggunakan Sequential Searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss =  (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        // melakukan pencariian data menggunakan binary search
        System.out.println("\n----------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa Yang Dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("----------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("----------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 =  (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("\nData Mahasiswa Sebelum Sorting: ");
        // list.tampil();

        // System.out.println("\nData Mahasiswa Setelah Sorting Berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData Yang Sudah Terurut Menggunakan SELECTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("\nData Yang Sudah Terurut Menggunakan INSERTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();
    }
}
