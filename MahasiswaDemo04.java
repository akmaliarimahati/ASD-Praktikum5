import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
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
        for (int i = 0; i < list.listMhs.length; i++) {
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

        System.out.println("\nData Mahasiswa Sebelum Sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa Setelah Sorting Berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData Yang Sudah Terurut Menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
}
