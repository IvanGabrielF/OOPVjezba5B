package pckg_webshop;

public class Customer {
    private String adress;
    private String name;
    private Payment payment;


    public Customer(Payment payment, String name, String adress){
        this.payment=payment;
        this.name=name;
        this.adress=adress;
    }
    public String getAdress(){
        return adress;
    }
    public Payment getPayment(){
        return payment;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
