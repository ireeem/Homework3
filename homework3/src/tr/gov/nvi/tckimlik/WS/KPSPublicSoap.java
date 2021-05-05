package tr.gov.nvi.tckimlik.WS;

public interface KPSPublicSoap extends java.rmi.Remote {
    public boolean TCKimlikNoDogrula(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, int dogumYili) throws java.rmi.RemoteException;
}
