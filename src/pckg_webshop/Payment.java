package pckg_webshop;

import java.util.Scanner;

public class Payment {
    private Scanner scanner = new Scanner(System.in);
    Payment(){
        payPackage();

    }
    private void possiblePaymentMethod(){
        System.out.println("Possible payment method: ");
        System.out.println("COD Cash On Delivery");
        System.out.println("CC Credit Card");
        System.out.println("PP PayPal service");
    }

    private String payPackage(){
        boolean paymentStatus = true;
        String paymentMethod = "";
        possiblePaymentMethod();
        System.out.println("Please enter payment option:");

        while (paymentStatus) {
            String chosenPayment = scanner.nextLine().trim();
            switch (chosenPayment.toUpperCase()) {
                case "COD":
                    paymentMethod = "cash when product is delivered";
                    System.out.println("Payment method: " + paymentMethod);
                    paymentStatus = false;
                    break;
                case "CC":
                    paymentMethod = "credit card / debit card";
                    System.out.println("Payment method: " + paymentMethod);
                    paymentStatus = false;
                    break;
                case "PP":
                    paymentMethod = "paypal";
                    System.out.println("Payment method: " + paymentMethod);
                    paymentStatus = false;
                    break;
                default:
                    System.out.println("Unsupported payment option. Please try again.");
            }
        }

        return paymentMethod;
    }


}


