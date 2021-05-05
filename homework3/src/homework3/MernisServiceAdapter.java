package homework3;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException{
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(customer.nationalityId),
				customer.firstName.toUpperCase(),
				customer.lastName.toUpperCase(),
				customer.yearOfBirth);
	
	}

}
