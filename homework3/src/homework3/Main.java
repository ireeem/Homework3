package homework3;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException, Exception{
		Customer customer = new Customer(1,"Ýrem","Can",2002,"42856474177");
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.addCustomer(customer);		


	}

}