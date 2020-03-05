package contoh;

public class Customer{

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