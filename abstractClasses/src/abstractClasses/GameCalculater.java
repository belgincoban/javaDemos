package abstractClasses;

public abstract class GameCalculater {
	
    //temel nesne
	//Abstract class: new'lenemezler.
	//içerisinde zorunlu doldurulması gereken operasyonlar tanımlayabiliriz.
	//nesneoluşturmazlar ama child class'ların referanslarını tutarlar.
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
}
