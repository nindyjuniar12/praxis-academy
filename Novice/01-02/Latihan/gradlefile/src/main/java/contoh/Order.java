package contoh;

public class Order{
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