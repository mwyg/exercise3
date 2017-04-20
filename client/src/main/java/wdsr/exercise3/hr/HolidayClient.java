package wdsr.exercise3.hr;

import java.net.URL;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import wdsr.exercise3.hr.definitions.HumanResource;
import wdsr.exercise3.hr.definitions.HumanResourceServiceLocator;
import wdsr.exercise3.hr.schemas.EmployeeType;
import wdsr.exercise3.hr.schemas.HolidayRequest;
import wdsr.exercise3.hr.schemas.HolidayType;

// TODO Complete this class to book holidays by issuing a request to Human Resource web service.
// In order to see definition of the Human Resource web service:
// 1. Run HolidayServerApp.
// 2. Go to http://localhost:8090/holidayService/?wsdl
public class HolidayClient {
	
	private HumanResource humanResource;
	/**
	 * Creates this object
	 * @param wsdlLocation URL of the Human Resource web service WSDL
	 */
	public HolidayClient(URL wsdlLocation) {
		HumanResourceServiceLocator locator = new HumanResourceServiceLocator();
		try {
			humanResource = locator.getHumanResourcePort(wsdlLocation);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sends a holiday request to the HumanResourceService.
	 * @param employeeId Employee ID
	 * @param firstName First name of employee
	 * @param lastName Last name of employee
	 * @param startDate First day of the requested holiday
	 * @param endDate Last day of the requested holiday
	 * @return Identifier of the request, if accepted.
	 * @throws ProcessingException if request processing fails.
	 */
	public int bookHoliday(int employeeId, String firstName, String lastName, Date startDate, Date endDate) throws ProcessingException {
		
		HolidayType holiday = new HolidayType(startDate, endDate);
		EmployeeType employee = new EmployeeType(employeeId, firstName, lastName);
		HolidayRequest request = new HolidayRequest(holiday, employee);
		
		try {
			return humanResource.holiday(request).getRequestId();
		} catch (Exception e) {
			throw new ProcessingException();
		}
		
	}
}
