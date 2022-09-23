import model.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();      // product1 adında, Product nesnesi oluşturuyoruz.

        // Aşağıda yaptığım işlemler : set value

        product1.name = "Apple MacBook Pro";   // isme değer atadım.
        product1.unitPrice = 79.559;           // fiyata değer atadım.
        product1.discount = 7;                 // indirim oranına değer atadım.
        product1.unitsInStock = 5;             // stok adetine değer atadım.
        product1.imageUrl = "rasitesdmr1.jpg";  // image değer atadım.

        // Burada yaptığım işlem ise : get value

        System.out.println(product1.name);      // product2 adında, Product nesnesi oluşturuyoruz.

        Product product2 = new Product();
        product2.name = "Lenovo IdeaPad Gaming";
        product2.unitPrice = 21.999;
        product2.discount = 8;
        product2.unitsInStock = 10;
        product2.imageUrl = "rasitesdmr2.jpg";

        Product product3 = new Product();       // product3 adında, Product nesnesi oluşturuyoruz.
        product3.name = "Dell Vostro";
        product3.unitPrice = 6.152;
        product3.discount = 1;
        product3.unitsInStock = 2;
        product3.imageUrl = "rasitesdmr3.jpg";

        Product[] products = {product2, product3};   // products adında,Product array'i oluşturduk ve içine product2 ve product3 ekledik.
        System.out.println("<ul>");
        for (Product product : products) {  // products'ları tek tek gez (Önce product2 gez ve işlemlerini yap, sonra product3 gez ve işlemlerini yap).
            System.out.println("<li>" + product.name + "</li>");
        }
        System.out.println("</ul>");

    }
}