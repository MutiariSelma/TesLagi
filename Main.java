package Praktikum.UTP;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawaiPerpus = new Pegawai("Tia", "195150200111025");
        pegawaiPerpus.tampilkanInfoPegawai();

        pegawaiPerpus.menambahBuku("Tutorial Java", "Gratia", 2);
        pegawaiPerpus.menambahBuku("Tutorial Phyton", "Safir", 2);
        pegawaiPerpus.menambahBuku("Tutorial Javascript", "Bagus", 2);
        pegawaiPerpus.menambahBuku("Tutorial Golang", "Budi", 2);
        pegawaiPerpus.menambahBuku("Tutorial Javascript", "Shinta", 2);
       
        //
    
        pegawaiPerpus.menambahPelanggan("Wildan", "1");
        pegawaiPerpus.menambahPelanggan("Machsun", "2");
        pegawaiPerpus.menambahPelanggan("Adin", "3");
        pegawaiPerpus.menambahPelanggan("Machsun", "4");

        // perpus.pinjam("Wildan", "Tutorial Java");
        // perpus.pinjam("Machsun", "Tutorial Java");
        // perpus.pinjam("Adin", "Tutorial Java");
        // perpus.pinjam("Adin", "Tutorial Phyton");
        // perpus.pinjam("Wildan", "Tutorial Golang");
        // perpus.pinjam("Wildan", "Tutorial Javascript");
        // perpus.pinjam("Wildan", "Tutorial Phyton");
        // perpus.pinjam("Cantika", "Tutorial Golang");
        // perpus.pinjam("Machsun", "Sastra Inggris");
        // perpus.pinjam("Adin", "Tutorial Phyton");
        // perpus.pinjam("Cantika", "Cara cepat belajar Phyton");

        // perpus.tampilkaInfoPerpustakaan;
        perpus.tampilkaInfoPerpustakaan();
    }
    
}
