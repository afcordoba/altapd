/**
 * ZssdTipoCambio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZssdTipoCambio  implements java.io.Serializable {
    private java.lang.String fromCurr;

    private java.lang.String toCurrency;

    private java.lang.String date;

    private java.math.BigDecimal exchRate;

    public ZssdTipoCambio() {
    }

    public ZssdTipoCambio(
           java.lang.String fromCurr,
           java.lang.String toCurrency,
           java.lang.String date,
           java.math.BigDecimal exchRate) {
           this.fromCurr = fromCurr;
           this.toCurrency = toCurrency;
           this.date = date;
           this.exchRate = exchRate;
    }


    /**
     * Gets the fromCurr value for this ZssdTipoCambio.
     * 
     * @return fromCurr
     */
    public java.lang.String getFromCurr() {
        return fromCurr;
    }


    /**
     * Sets the fromCurr value for this ZssdTipoCambio.
     * 
     * @param fromCurr
     */
    public void setFromCurr(java.lang.String fromCurr) {
        this.fromCurr = fromCurr;
    }


    /**
     * Gets the toCurrency value for this ZssdTipoCambio.
     * 
     * @return toCurrency
     */
    public java.lang.String getToCurrency() {
        return toCurrency;
    }


    /**
     * Sets the toCurrency value for this ZssdTipoCambio.
     * 
     * @param toCurrency
     */
    public void setToCurrency(java.lang.String toCurrency) {
        this.toCurrency = toCurrency;
    }


    /**
     * Gets the date value for this ZssdTipoCambio.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this ZssdTipoCambio.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the exchRate value for this ZssdTipoCambio.
     * 
     * @return exchRate
     */
    public java.math.BigDecimal getExchRate() {
        return exchRate;
    }


    /**
     * Sets the exchRate value for this ZssdTipoCambio.
     * 
     * @param exchRate
     */
    public void setExchRate(java.math.BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZssdTipoCambio)) return false;
        ZssdTipoCambio other = (ZssdTipoCambio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromCurr==null && other.getFromCurr()==null) || 
             (this.fromCurr!=null &&
              this.fromCurr.equals(other.getFromCurr()))) &&
            ((this.toCurrency==null && other.getToCurrency()==null) || 
             (this.toCurrency!=null &&
              this.toCurrency.equals(other.getToCurrency()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.exchRate==null && other.getExchRate()==null) || 
             (this.exchRate!=null &&
              this.exchRate.equals(other.getExchRate())));
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
        if (getFromCurr() != null) {
            _hashCode += getFromCurr().hashCode();
        }
        if (getToCurrency() != null) {
            _hashCode += getToCurrency().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getExchRate() != null) {
            _hashCode += getExchRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZssdTipoCambio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdTipoCambio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCurr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FromCurr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExchRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
