package polimorphismDemo;

public class Main {

	public static void main(String[] args) {

		//aralarında inheritance bulunan class'ların birbirinin referansını tutma
		
		//EmailLogger emailLogger = new EmailLogger();
		//emailLogger.log("log mesaj");
		
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger()};
		
		//for (BaseLogger logger : loggers) {
			
			//logger.log("log mesajı");
		//}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
