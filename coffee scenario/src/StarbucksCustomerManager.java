
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private Entity entity;
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: "+customer.getFirstName());
			
		}else {
			System.out.println("Not a valid person!");
		}
		
	}


	
	


}
