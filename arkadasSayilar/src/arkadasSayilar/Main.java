package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		int sayi1=220;
		int sayi2=284;
		
		int toplam1=0;
		int toplam2=0;
		
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i ==0) {
				toplam1=toplam1+i;
			}
		}
		
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i ==0) {
				toplam2=toplam2+i;
			}
		}
		
		if (sayi1 ==toplam2 && sayi2==toplam1) {
			System.out.println("bu iki sayi arkadaştır.");
		}
		else {
			System.out.println("bu iki sayı arkadaş değildir.");
		}
		
		double isd= böl(5, 0);
		System.out.println(isd);
		
	}
	public static double böl(int sayi1, int sayi2){

        if(sayi2<=0){
           return 0;
        }
        double bölüm= sayi1/sayi2;

        return bölüm ;
    }
}


