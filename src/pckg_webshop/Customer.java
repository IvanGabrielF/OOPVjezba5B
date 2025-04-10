package pckg_webshop;

public class Customer {
    private String address;
    private int id;
    private Payment payment;

    public Customer(String address, int id, Payment payment){
        this.address=address;
        this.id=id;
        this.payment=payment;
    }
    public String getAddress(){
        return address;
    }
    public Payment getPayment(){
        return payment;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", payment=" + payment +
                '}';
    }
}
