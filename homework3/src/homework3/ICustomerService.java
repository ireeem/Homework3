package homework3;

import java.rmi.RemoteException;

public interface ICustomerService {
	void addCustomer(Customer customer) throws RemoteException, Exception;

}