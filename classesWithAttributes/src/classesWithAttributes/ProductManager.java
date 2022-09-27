package classesWithAttributes;

public class ProductManager {

	//Bir class'ın içinde başka bir class'ı kullanabiliriz.
	//Bir class(veya fonksiyon , interface,..) tek bir iş yapmalı
	//operasyon tutan class
	//Product: attribute tutan class
	public void addProduct(Product product) {
		System.out.println("Ürün eklendi : "+ product.get_name());
	}
}
