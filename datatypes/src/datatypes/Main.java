package datatypes;

public class Main {

	public static void main(String[] args) {
		//Strongly Typed
		//Tipleri, özellikle dönüşümünü belirtmeden başka 
		//bir tip yerine kullanamadığınız dillere denir.

		//Javada bir değişken yazarken tipinin ne olduğunu belirtmek zorundasınız. 
		//Daha sonra o değişkene o tip dışındaki bir veri atayamazsınız. 
		//Hem kod anında, hemde derleme esnasında hata alırsınız.
		//yani tip güvenli bir dildir.
		
		
		//tamsayılar->byte,short,int,long
	    //ondalıklı sayılar->float, double
		//metinsel ifade-> String
		//iki durumlu ifadeler-> boolean
		
		int sayi=12;
		//sayi="ankara"; --hata verir.
		
		char karakter='a';
		String sehir="Ankara"; //karakter topluluğudur.
		
		boolean dogruMu=true;
		
	}

}
