package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj="Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı"+ mesaj.length());
		System.out.println("5.Eleman :"+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın!"));
		System.out.println(mesaj.startsWith("B")); //B ile başlıyor mu?
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('e'));*/
		
		System.out.println(mesaj.replace(" ","*"));
		
		System.out.println(mesaj.substring(2));   //sonuna kadar keser.
		System.out.println(mesaj.substring(2,4)); //4.index'i hesaba katmaz.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2="   Bugün hava çok güzel.     ";
		System.out.println(mesaj2);
		System.out.println(mesaj2.trim());

	}	

}
