package Model;

public class Tumbuhan {
    private String namatumbuhan;
    private String warnadaun;
    private int panjangdaun;
    private int tinggitanaman;

    public Tumbuhan() {
    }

    public Tumbuhan(String namatumbuhan, String warnadaun, int panjangdaun, int tinggitanaman) {
        this.namatumbuhan = namatumbuhan;
        this.warnadaun = warnadaun;
        this.panjangdaun = panjangdaun;
        this.tinggitanaman = tinggitanaman;
    }

    public String getNamatumbuhan() {
        return namatumbuhan;
    }

    public void setNamatumbuhan(String namatumbuhan) {
        this.namatumbuhan = namatumbuhan;
    }

    public String getWarnadaun() {
        return warnadaun;
    }

    public void setWarnadaun(String warnadaun) {
        this.warnadaun = warnadaun;
    }

    public int getPanjangdaun() {
        return panjangdaun;
    }

    public void setPanjangdaun(int panjangdaun) {
        this.panjangdaun = panjangdaun;
    }

    public int getTinggitanaman() {
        return tinggitanaman;
    }

    public void setTinggitanaman(int tinggitanaman) {
        this.tinggitanaman = tinggitanaman;
    }

    public void viewData(){
        System.out.println("=========== View Data ==========");
        System.out.println("Nama Tumbuhan      \t: "+namatumbuhan);
        System.out.println("Warna Daun     \t\t: "+warnadaun);
        System.out.println("Panjang Daun    \t: "+panjangdaun+" cm");
        System.out.println("Tinggi Tanaman     \t: "+tinggitanaman+" cm");
        System.out.println("=========== View Data ==========");
        System.out.println("");
    }
}
