package abstractClasses;

public class Main {

	    //Abstract class: new'lenemezler.
		//içerisinde zorunlu doldurulması gereken operasyonlar tanımlayabiliriz.
		//nesneoluşturmazlar ama child class'ların referanslarını tutarlar.
		
	public static void main(String[] args) {

		GameCalculater gameCalculater = new KidsGameCalculater();
		gameCalculater.hesapla();
	}

}
