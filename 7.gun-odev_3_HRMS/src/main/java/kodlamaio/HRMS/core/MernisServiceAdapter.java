package kodlamaio.HRMS.core;

import java.rmi.RemoteException;
import java.util.Locale;

import kodlamaio.HRMS.entities.concretes.Jobseeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean chechIfRealPerson(Jobseeker jobseeker) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
				result = client.TCKimlikNoDogrula(
				Long.parseLong(jobseeker.getIdentityNo()),
				jobseeker.getFirstName().toUpperCase(new Locale("tr")),
				jobseeker.getLastName().toUpperCase(new Locale("tr")),
				jobseeker.getBirthDate());
		}catch(RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
