public class Product {

    private String item; // instance variables
    private int cost; // instance variables



    public Product(String productName, int price){ // products constructor
        item = productName; // i could use " this.productName "
        cost = price;
    }


    public String getItem() { // to get the name public
        return item;
    }

    public void setItem(String item) { // to be able to set the name public
        this.item = item;
    }

    public int getCost() { // to get the price public
        return cost;
    }

    public void setCost(int cost) { // to be able to set the price public
        this.cost = cost;
    }
}
