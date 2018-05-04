import java.util.ArrayList;

public class ShoppingCart { // on this example we can see all the product properties, however, it will not show on the console.


    private ArrayList<Product> products;// creating an array list

    public ShoppingCart() { // creating an array list
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) { // to add product to the products array
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}



//public class ShoppingCart { // on this example we can se the name of the products but not the prices
//
//
//    private ArrayList<String> products;// creating an array list
//
//    public ShoppingCart() { // creating an array list
//        this.products = new ArrayList<>();
//    }
//
//    public void addProduct(Product product) { // to add product to the products array
//        this.products.add(product.getItem());
//    }
//
//    public ArrayList<String> getProducts() {
//        return products;
//    }
//}
