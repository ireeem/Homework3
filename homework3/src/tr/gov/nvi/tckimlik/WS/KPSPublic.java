package tr.gov.nvi.tckimlik.WS;

public interface KPSPublic extends javax.xml.rpc.Service {
    public java.lang.String getKPSPublicSoapAddress();

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException;

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}