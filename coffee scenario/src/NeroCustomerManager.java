
public class NeroCustomerManager extends BaseCustomerManager {
	CustomerCheckService checkService;

	public NeroCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: "+customer.getFirstName());
			
		}else {
			System.out.println("Not a valid person!");
		}
	}
	


}
