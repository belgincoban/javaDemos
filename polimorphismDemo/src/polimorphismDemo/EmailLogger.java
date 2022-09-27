package polimorphismDemo;

public class EmailLogger extends BaseLogger {

	public void log(String mesaj) {
		System.out.println("logger to email : "+mesaj);
	}
}
