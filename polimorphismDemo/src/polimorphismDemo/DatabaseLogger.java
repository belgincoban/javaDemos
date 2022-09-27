package polimorphismDemo;

public class DatabaseLogger extends BaseLogger {

	public void log(String mesaj) {
		System.out.println("logger to database : "+mesaj);
	}
}
