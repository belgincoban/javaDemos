package polimorphismDemo;

public class FileLogger extends BaseLogger {

	public void log(String mesaj) {
		System.out.println("logger to file: "+mesaj);
	}
}
