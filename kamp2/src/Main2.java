import model.Product;
import model.Product2;

public class Main2 {
    public static void main(String[] args) {

        Product2 product1 = new Product2();

        product1.setName("Apple MacBook Pro");
        product1.setUnitPrice(25000);
        product1.setDiscount(8);
        product1.setUnitsInStock(3);
        product1.setImageUrl("rasitesdmr.jpg");

        Product2 product2 = new Product2();
        product2.setName("Lenovo IdeaPad Gaming");
        product2.setUnitPrice(21.999);
        product2.setDiscount(8);
        product2.setUnitsInStock(10);
        product2.setImageUrl("rasitesdmr2.jpg");

        Product2 [] products = {product1,product2};

        for (Product2 product : products){
            System.out.println(product.getName());
        }
    }
}
