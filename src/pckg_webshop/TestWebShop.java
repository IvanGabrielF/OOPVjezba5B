package pckg_webshop;

public class TestWebShop {
    public static void main(String[] args) {
        Package pckg01 = new Package("Paket 124");
        pckg01.addJacketToOrder(3);
        pckg01.addSneakersToOrder(2);
        Payment payment = new Payment();
        Customer customer = new Customer(payment, "Ivan", "Marulićeva 2, Zagreb");
        WebShop webShop = new WebShop("Zadar", customer, pckg01, payment);
        webShop.orderContent();


    }
}
