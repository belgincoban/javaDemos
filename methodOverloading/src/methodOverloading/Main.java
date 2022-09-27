package methodOverloading;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(5, 8);
		
		dortIslem.topla(5, 8, 2);
	}

}
