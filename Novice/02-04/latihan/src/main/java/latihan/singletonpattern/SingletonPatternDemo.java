package latihan.singletonpattern;

public class SingletonPatternDemo
{
    public static void main(String[] args) {
        //illegal construct
        //Compail waktu kesalahan : constructor SingleObject tidak ditemukan
        //SingleObject object = new SingleObject();

        //Mendapatkan dari object yang ada
        SingleObject object = SingleObject.getInstance();

        //Menampilkan pesan
        object.showMessage();
    }
}