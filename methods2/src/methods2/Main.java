package methods2;

public class Main {

	public static void main(String[] args) {
		//operasyon , method, fonksiyon aynı şeyler
		//void: emir kipi gibi düşün,bir işi yap.
		//sonuç döndürmez. 
		//return: bir şey oluşturdu ve onu bize
		//sonuç olarak veriyor.
		
		String mesaj="Bugün hava çok güzel";
		String mesajYeni = mesaj.substring(0, 2);
		System.out.println(mesajYeni);
		
		String methodMesaj=mesaj();
		
		System.out.println(methodMesaj);
		int toplam=topla(2, 5);
		
		
		//variable arguments
		//belirli bir türden sıfır veya birden fazla
		//argümanı metoda tek seferde parametre geçmemizi sağlar.
		
		int sayiToplamı=topla2(1,4,7,8);
		System.out.println(sayiToplamı);
	}
	
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static String mesaj() {
		return "İstanbul";
	}
	
	public static int topla(int sayi1, int sayi2) {
		
		int sonuc = sayi1+sayi2;
		return sonuc; /* sayi1+sayi2;*/ 
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for (int sayi : sayilar) {
			toplam = toplam+sayi;
		}
		return toplam;
	}
}
