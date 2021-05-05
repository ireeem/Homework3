package homework3;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void addCustomer(Customer customer) throws RemoteException, Exception{
		System.out.println("Saved to db:"+ customer.firstName);
		
	}
	

}