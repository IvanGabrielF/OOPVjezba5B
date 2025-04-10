package pckg_webshop;

public class Item {

    protected int quantity;
    protected float itemInitPrice;
    protected String itemDescription;
    protected int itemID;
    protected static int cntID = 10;
    protected float totalPrice;


    public Item(int quantity, String itemDescription){
        this.quantity = quantity;
        this.itemDescription =itemDescription;


    }
    public float getTotalPrice(){
        return  totalPrice;
    }

    public void calculatePrice(){
        totalPrice = quantity*itemInitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
