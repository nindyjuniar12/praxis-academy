package kasus;

public class penyewaan {
     public mobil mobilDisewa;
     public datapenyewa anggota;

        public void sewa(datapenyewa penyewa, mobil disewa){
            anggota=penyewa;
            mobilDisewa=disewa;
        }

        public void lihatDataPenyewa(){
            System.out.println("Nama        : "+anggota.getName());
            System.out.println("Alamat      : "+anggota.getAlamat());

            System.out.println("Jenis Mobil : "+mobilDisewa.getJenis());
            System.out.println("Merek Mobil : "+mobilDisewa.getMerek());
        }

      
    }