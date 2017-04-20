/**
 * HolidayRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wdsr.exercise3.hr.schemas;

public class HolidayRequest  implements java.io.Serializable {
    private wdsr.exercise3.hr.schemas.HolidayType holiday;

    private wdsr.exercise3.hr.schemas.EmployeeType employee;

    public HolidayRequest() {
    }

    public HolidayRequest(
           wdsr.exercise3.hr.schemas.HolidayType holiday,
           wdsr.exercise3.hr.schemas.EmployeeType employee) {
           this.holiday = holiday;
           this.employee = employee;
    }


    /**
     * Gets the holiday value for this HolidayRequest.
     * 
     * @return holiday
     */
    public wdsr.exercise3.hr.schemas.HolidayType getHoliday() {
        return holiday;
    }


    /**
     * Sets the holiday value for this HolidayRequest.
     * 
     * @param holiday
     */
    public void setHoliday(wdsr.exercise3.hr.schemas.HolidayType holiday) {
        this.holiday = holiday;
    }


    /**
     * Gets the employee value for this HolidayRequest.
     * 
     * @return employee
     */
    public wdsr.exercise3.hr.schemas.EmployeeType getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this HolidayRequest.
     * 
     * @param employee
     */
    public void setEmployee(wdsr.exercise3.hr.schemas.EmployeeType employee) {
        this.employee = employee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HolidayRequest)) return false;
        HolidayRequest other = (HolidayRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.holiday==null && other.getHoliday()==null) || 
             (this.holiday!=null &&
              this.holiday.equals(other.getHoliday()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHoliday() != null) {
            _hashCode += getHoliday().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HolidayRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://exercise3.wdsr/hr/schemas", ">HolidayRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holiday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exercise3.wdsr/hr/schemas", "Holiday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://exercise3.wdsr/hr/schemas", "HolidayType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exercise3.wdsr/hr/schemas", "Employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://exercise3.wdsr/hr/schemas", "EmployeeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
