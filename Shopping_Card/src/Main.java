import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Product p1 = new Product("vacuum cleaner", 100); // instances
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product p4 = new Product("car", 500);
        Product p5 = new Product("bike", 10);
        Product p6 = new Product("car", 500);
        Product p7 = new Product("car", 500);
        Product p8 = new Product("car", 500);
        Product p9 = new Product("pencil", 3);



       // System.out.println("He bought " + p1.getItem() + " that costs " + p1.getCost());

         ShoppingCart cart = new ShoppingCart();


         cart.addProduct(p1);
         cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);
        cart.addProduct(p5);
        cart.addProduct(p6);
        cart.addProduct(p7);
        cart.addProduct(p8);
        cart.addProduct(p9);


        System.out.println(cart.getProducts());













        int bucky[] = new int [5]; // example of arrays
        bucky[0]=87;
        bucky[1]=80;
        bucky[3]=82;
        System.out.println(bucky[0]);


        String cars[] = {"ferrari", "ford", "renault", "opel"};// example of array initializer
        System.out.println(Arrays.toString(cars));

    }
}