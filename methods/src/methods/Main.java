package methods;

public class Main {

	public static void main(String[] args) {
     //fonk. , method yazarak kendimizi tekrarlamayı engelliyoruz.
		
		sayiBulmaca();
		
	}

	public static void sayiBulmaca() {
		
		int[] sayilar= {1,2,3,4,6,7,8,5};
		int aranacak=6;
		boolean varMi=false;
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if (varMi) {
			//System.out.println("sayi mevcuttur: " +aranacak);
			mesaj(aranacak);
		}
		else {
			System.out.println("sayi mevcut değildir : " +aranacak);
		}
		
	}
	
	public static void mesaj(int aranacak) {
		System.out.println("sayı mevcuttur : "+aranacak);
	}
	
	//reusability:yeniden kullanılabilirlik
	
}
