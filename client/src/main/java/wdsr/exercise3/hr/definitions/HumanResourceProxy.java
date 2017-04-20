package wdsr.exercise3.hr.definitions;

public class HumanResourceProxy implements wdsr.exercise3.hr.definitions.HumanResource {
  private String _endpoint = null;
  private wdsr.exercise3.hr.definitions.HumanResource humanResource = null;
  
  public HumanResourceProxy() {
    _initHumanResourceProxy();
  }
  
  public HumanResourceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHumanResourceProxy();
  }
  
  private void _initHumanResourceProxy() {
    try {
      humanResource = (new wdsr.exercise3.hr.definitions.HumanResourceServiceLocator()).getHumanResourcePort();
      if (humanResource != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)humanResource)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)humanResource)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (humanResource != null)
      ((javax.xml.rpc.Stub)humanResource)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public wdsr.exercise3.hr.definitions.HumanResource getHumanResource() {
    if (humanResource == null)
      _initHumanResourceProxy();
    return humanResource;
  }
  
  public wdsr.exercise3.hr.schemas.HolidayResponse holiday(wdsr.exercise3.hr.schemas.HolidayRequest holidayRequest) throws java.rmi.RemoteException{
    if (humanResource == null)
      _initHumanResourceProxy();
    return humanResource.holiday(holidayRequest);
  }
  
  
}