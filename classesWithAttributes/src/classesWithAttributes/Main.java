package classesWithAttributes;

import java.nio.channels.NonReadableChannelException;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.set_name("Laptop");
		product.set_description("Asus Laptop");
		product.set_price(1500);
		product.set_stockAmount(3);
	//	product.set_kod();
		
		ProductManager productManager = new ProductManager();
		productManager.addProduct(product);
		
		System.out.println(product.get_kod());
		
		Product product2 = new Product("telefon", "iphone telefon", 5000, 5);
		
		System.out.println(product2.get_kod());
		//class'lar ilgili özellikleri, ilgili operasyonları tutarlar.
		//Bir class'ın içinde başka bir class'ı kullanabiliriz.
	}

}
