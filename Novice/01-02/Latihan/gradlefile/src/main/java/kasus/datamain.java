package kasus;

public class datamain {
    public static void main(String[] args){
        mobil mobilDisewa = new mobil();
        datapenyewa anggota = new datapenyewa();

        anggota.setName("Ade Majid M.");
        anggota.setAlamat("Yogya");

        mobilDisewa.setMerek("Suzuki");
        mobilDisewa.setJenis("MiniBus");

        penyewaan diSewa=new penyewaan();
        diSewa.sewa(anggota, mobilDisewa);
        diSewa.lihatDataPenyewa();

    }
    
}