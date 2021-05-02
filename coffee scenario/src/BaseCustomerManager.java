
public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Customer has successfully saved to db: "+ customer.getFirstName());
		
	}

}
