
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Dogukan", "Uykun", 90);
		customerManager.save(customer);
		

	}

}
