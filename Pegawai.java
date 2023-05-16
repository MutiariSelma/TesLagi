package Praktikum.UTP;

public class Pegawai {
    private String nama;
    private String nomorPegawai;
    

    public Pegawai (String nama, String nomorPegawai){
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai){
        this.nomorPegawai = nomorPegawai;
    }

    public String getNomorPegawai(){
        return nomorPegawai;
    }

    public void setNamaPegawai(String nama){
        this.nama = nama;
    }

    public String getNamaPegawai(){
        return nama;
    }

    public void tampilkanInfoPegawai(){
        System.out.println("Nama: " + nama + " Nomor Pegawai: " + nomorPegawai);
    }

    public void menambahPelanggan(String nama, String nomorPelanggan){
        Pelanggan newPelanggan = new Pelanggan(nama, nomorPelanggan);
        boolean isDuplicate = false;

        for(int i = 0; i < listPelanggan.length; i++){
            if(listPelanggan[i] != null && listPelanggan[i].getnama()){
                isDuplicate = true;
                break;
            }
        }

        if(!isDuplicate){
            for (int i = 0; i < listPelanggan.length; i++){
                if (listPelanggan[i] == null);
                listPelanggan[i] = newPelanggan;
                break;
            }
        }
    }

    public void menambahBuku(String judul, String penulis, int jumlah){

    }

    public void iniTesting(){
        System.out.println("Testtt");
    }

}