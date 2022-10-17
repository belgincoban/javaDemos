package abstractDemo;

public class CustomManager {

	private BaseDatabaseManager databaseManager;
	
	public CustomManager(BaseDatabaseManager baseDatabaseManager) {
		databaseManager=baseDatabaseManager;
	}
	
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
