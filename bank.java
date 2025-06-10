public class bank {
    String cust_name;
    int customer_id;
    String customer_address;

    public bank(String name, int id, String address) {
        this.cust_name = name;
        this.customer_id = id;
        this.customer_address = address;
    }

    public static void main(String[] args) {
        bank customer = new bank("Unnati", 13, "Delhi");
        System.out.println("Customer Name: " + customer.cust_name);
        System.out.println("Customer ID: " + customer.customer_id);
        System.out.println("Customer Address: " + customer.customer_address);
    }
}
