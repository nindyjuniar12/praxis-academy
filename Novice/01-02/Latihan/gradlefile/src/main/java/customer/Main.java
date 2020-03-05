import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        boolean kondisi = true;
        do{

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan Nama pembeli : ");
        String namaPembeli = inputScanner.nextLine();

        System.out.print("Masukkan Alamat pembeli : ");
        String namaAlamat = inputScanner.nextLine();

        Customer customer1 = new Customer(namaPembeli, namaAlamat);


        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = inputScanner.nextLine();

        System.out.print("Masukkan Harga Barang : ");
        int hargaBarang = inputScanner.nextInt();

        System.out.print("Masukkan Jumlah Barang : ");
        int jumlahBarang = inputScanner.nextInt();

        Order order1 = new Order(namaBarang, jumlahBarang, hargaBarang);
        customer1.order(order1);      

        System.out.print("Lanjut ? (Y/T) : ");
        String kondisiInput = inputScanner.next();

        if (kondisiInput.equalsIgnoreCase("y")){
            kondisi = true;
        }else{
            kondisi = false;
        }
    }while(kondisi);
    }
}

class Customer{

    private String place_order;
    private String knows_name;
    private String knows_addres;
    private String knows_Customer_number;
    private String order_history;
    
    public Customer(String knows_name, String knows_addres) {
        this.knows_name = knows_name;
        this.knows_addres = knows_addres;
    }
    
        public void order(Order order){
            order.orderItemDetail(); //memanggil order item yang ada diorder
    
        }
    
    }
    class Order{
        private String knows_placment_date;
        private String knows_delivery_date;
        private int total;
        private int amount;
        private int price_items;
        private String applicable_taxes;
        private String order_number;
        private String order_items;
    
        public Order(String order_items, int price_items, int amount) {
        
            this.amount = amount;
            this.price_items = price_items;
            this.order_items = order_items;
        }
    
        public void orderItemDetail(){
    
            total = price_items *amount;
    
            System.out.println("--------Rincian Belanja Anda--------");
            System.out.println("name item : " + order_items);
            System.out.println("price item : " + price_items);
            System.out.println("amount item : " + amount);
            System.out.println("total : " + total);
        }
    }