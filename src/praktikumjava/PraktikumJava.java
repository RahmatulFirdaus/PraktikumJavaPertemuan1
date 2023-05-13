package praktikumjava;

import Model.*;

public class PraktikumJava {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId(1);
        mahasiswa.setIPK(4);
        mahasiswa.setNama("Rahmatul Firdaus");
        mahasiswa.setNPM("2110010515");
        mahasiswa.viewData();

        Mahasiswa m1 = new Mahasiswa(
                2,
                "2110010515",
                "Rahmatul",
                4
        );
        m1.viewData();

        Tumbuhan tumbuhan = new Tumbuhan();
        tumbuhan.setNamatumbuhan("Tanaman Cabai Rawit");
        tumbuhan.setPanjangdaun(6);
        tumbuhan.setTinggitanaman(60);
        tumbuhan.setWarnadaun("Hijau Muda");
        tumbuhan.viewData();

        Tumbuhan tumbuhan1 = new Tumbuhan(
                "Tanaman Cabai Rawit",
                "Hijau Muda",
                6,
                60
        );
        tumbuhan1.viewData();

        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110010515");
        mt.setNama("Rahmat");
        mt.setIPK(3.9);
        mt.viewData();

        mt.inputKRS();
    }
}
