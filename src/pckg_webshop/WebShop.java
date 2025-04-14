package pckg_webshop;

public class WebShop {
    private Customer customer;
    private Package aPackage;
    private Payment payment;
    private String location;


    public WebShop(String location, Customer customer, Package aPackage, Payment payment){
        this.payment=payment;
        this.aPackage = aPackage;
        this.customer=customer;
        this.location=location;

    }
    public void orderContent(){
        if(payment.equals(customer.getPayment())){
            System.out.println("Order successful!!");
            System.out.println("Order is coming from " + location + " to customer " + customer.getAdress());
            aPackage.showOrderContent();
        }else {
            System.out.println("Payment failed!");
        }
    }
}
