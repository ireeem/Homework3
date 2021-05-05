package homework3;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void addCustomer(Customer customer) throws RemoteException, Exception{
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db:"+ customer.firstName);
		}
		else {
			throw new Exception("Not a valid Person");
		}
		
		
		
	}




}