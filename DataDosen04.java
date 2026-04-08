public class DataDosen04 {
    Dosen04[] dataDosen04 = new Dosen04[10];
    int idx = 0;

    void tambah(Dosen04 dsn) {
        if (idx < dataDosen04.length) {
            dataDosen04[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen Sudah Penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data Dosen Masih Kosong.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen04[i].tampil();
                System.out.println("-------------------------");
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen04[j].usia < dataDosen04[j - 1].usia) {
                    Dosen04 temp = dataDosen04[j];
                    dataDosen04[j] = dataDosen04[j - 1];
                    dataDosen04[j - 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen04[j].usia > dataDosen04[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen04 temp = dataDosen04[maxIdx];
            dataDosen04[maxIdx] = dataDosen04[i];
            dataDosen04[i] = temp;
        }
    }
}