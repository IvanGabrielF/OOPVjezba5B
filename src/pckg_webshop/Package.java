package pckg_webshop;

import java.util.ArrayList;

public class Package {
    private float orderCost;
    private String orderBill;
    private int orderId = 1;

    private ArrayList<Item> packageItems = new ArrayList<>();

    public Package (String orderDesc){
        this.orderBill= orderDesc;
        this.orderId+=1;
    }

    public void showOrderContent(){
        System.out.println("\n ----------------------------------");
        for (Item item : packageItems){
            System.out.println(item);

        }
        System.out.println("Price is: " + orderCost);


    }
    public void addJacketToOrder(int numJackets){
        Jacket jacket = new Jacket(numJackets, "Jacket 011");
        packageItems.add(jacket);
        jacket.calculatePrice();
        orderCost+=jacket.getTotalPrice();
    }

    public void addSneakersToOrder(int numSneakers){
        Sneakers sneakers = new Sneakers(numSneakers,"Sneakers 101");
        packageItems.add(sneakers);
        sneakers.calculatePrice();
        orderCost+=sneakers.getTotalPrice();

    }

    public void AddTshirtToOrder(int numTshirt){
        T_Shirt tShirt = new T_Shirt(numTshirt,"T-Shirt 201");
        packageItems.add(tShirt);
        tShirt.calculatePrice();
        orderCost+=tShirt.getTotalPrice();
    }

    @Override
    public String toString() {
        System.out.println("Order description: " + orderBill);
        showOrderContent();
        return null;
    }
}
