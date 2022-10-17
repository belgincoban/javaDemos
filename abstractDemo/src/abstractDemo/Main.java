package abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomManager customManager = new CustomManager(new SqlServerDatabaseManager());
		customManager.getCustomers();
		//customManager.databaseManager= new OracleDatabaseManager();
		//customManager.getCustomers();
	}

}
