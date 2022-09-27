package overriding;

public class BaseKrediManager {

	public  double hesapla(double tutar) {
		return tutar * 1.18;
	}
	//final ile işaretlenmediği sürece bu metodu diğer sınıflar ezebilir.
	
}
