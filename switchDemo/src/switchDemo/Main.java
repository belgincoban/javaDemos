package switchDemo;

public class Main {

	public static void main(String[] args) {

		// öğrencinin aldığı nota göre ekrana
		// bilgi yazan program

		char grade = 'm';
		switch (grade) {
		case 'A': {

			System.out.println("mükemmel: geçtiniz");
			break;
		}
		case 'B': {
			System.out.println("çok güzel :geçtiniz");
			break;
		}
		case 'C': {

			System.out.println("iyi: geçtiniz");
			break;
		}
		default:
			System.out.println("geçersiz not girdiniz");
		}
	}
}
