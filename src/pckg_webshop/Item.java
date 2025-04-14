package pckg_webshop;

public class Item {
    protected int quantity;
    protected float itemInitPrice;
    protected String itemDescription;
    protected int itemId;

    protected static int cntId = 10;
    protected float totalPrice;


    public Item(int quantity, String itemDescription){
        this.quantity=quantity;
        this.itemDescription=itemDescription;


    }
    public float getTotalPrice(){
        return totalPrice;
    }
    public void calculatePrice(){
        totalPrice=quantity*itemInitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemId=" + itemId +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
