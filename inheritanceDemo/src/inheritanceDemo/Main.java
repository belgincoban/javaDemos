package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		//değişime direnmeyen programlar yazmak
		//zamala değişen taleplere çözümler yapmak
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		
	}

}
