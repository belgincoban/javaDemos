package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
		}	
		System.out.println("for döngüsü bitti");
		
		//While
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti");
		
		//Do-While
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do-while döngüsü bitti");
		
		//while-doWhile farkı
		//while döngüsünde şart sağlanmassa hiç bir şekilde
		//döngüye girmez.do-while da ise
		//şart uymassa bile kod bir kere çalışsacaltır.
		
	}

}
