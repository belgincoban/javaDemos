package classes;

public class Main {

	public static void main(String[] args) {
		//class: şablon, gruplamadır.
		//ortak operasyonları tutar.
		//class'lar referans tiplidir.
		//bir class'ı kullanabilmek için onun new'lenmesi gerekir.
		
		//CustomerManager customerManager; //hata verir. ilk değğer ataması referansa geçilmesi lazım.
		
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		//aynı tipte iki farklı nesne belleğin hep alanında tutulur.
		
		customerManager = customerManager2;
		//artık customManager referansı da customerManager2 nesnesini tutar. 
		//customerManager noktasının önceden tuttuğu nesne heap alanında kimse tarafından tutulmayan duruma gelir.
		//bir süre sonra heap alanındaki kimse tarafından referans edilmeyen nesneler
		//garbage collector (çöp temizleyici) tarafından bellekten temizlenir.
		
		
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		//primitive tipler(int , double , byte..) 
		//değerleriyle birlikte belleğin stack alanında tutulur.
		
		//*diziler referans tiplidir.
	}

}


