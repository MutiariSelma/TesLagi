package Praktikum.UTP;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku BukuPinjaman[] = new Buku[3];

    public Pelanggan(String nama, String nomorPelanggan){
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getnama(){
        return nama;
    }

    public void setNomorPelanggan(String nomorPelanggan){
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNomorPelanggan(){
        return nomorPelanggan;
    }

    public void tambahBuku(Buku bukuPinjam){

    }

    public void tampilkaninfoPelanggan(){
        
    }

    public boolean isMatch(Pelanggan p) {
        return false;
    }
}
