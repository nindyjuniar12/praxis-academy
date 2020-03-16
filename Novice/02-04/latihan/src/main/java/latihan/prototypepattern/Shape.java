package latihan.prototypepattern;

public abstract class Shape implements Cloneable
{
    private String id; //kode yang sesuai dengan namanya, aksesnya bersifat private, artinya data atau method hanya dapat diakses oleh kelas yang dimilikinya saja.
    protected String type; //kode yang dapat mengakses adalah class miliknya saja dan class turunannya

    abstract void gambar(); //gambar() menjadi class abstract karena tidak memiliki implementasi atau method yang tidak memiliki isi

    public String getType()
    {
        return type; //dikembalikan ke type
    }

    public String getId()
    {
        return id; //dikembalikan ke id
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public Object clone()
    {
        Object clone = null;

        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e)
            {
               e.printStackTrace();
            }

            return clone;
    }
}