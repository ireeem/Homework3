package homework3;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}