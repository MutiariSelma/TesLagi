package Praktikum.UTP;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    public Buku (String judul, String penulis, int jumlah){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getJudul(){
        return judul;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public int getJumlah(){
        return jumlah;
    }

    public String getPenulis(String penulis){
        return penulis;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void tampilkaninfoBuku(){
        System.out.println("Judul: " + judul + "Penulis: " + penulis + "Jumlah: " + jumlah);
    }
}
