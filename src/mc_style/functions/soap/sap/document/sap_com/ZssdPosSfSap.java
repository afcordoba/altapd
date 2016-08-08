/**
 * ZssdPosSfSap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZssdPosSfSap  implements java.io.Serializable {
    private java.lang.String zzpossf;

    private java.lang.String posnr;

    public ZssdPosSfSap() {
    }

    public ZssdPosSfSap(
           java.lang.String zzpossf,
           java.lang.String posnr) {
           this.zzpossf = zzpossf;
           this.posnr = posnr;
    }


    /**
     * Gets the zzpossf value for this ZssdPosSfSap.
     * 
     * @return zzpossf
     */
    public java.lang.String getZzpossf() {
        return zzpossf;
    }


    /**
     * Sets the zzpossf value for this ZssdPosSfSap.
     * 
     * @param zzpossf
     */
    public void setZzpossf(java.lang.String zzpossf) {
        this.zzpossf = zzpossf;
    }


    /**
     * Gets the posnr value for this ZssdPosSfSap.
     * 
     * @return posnr
     */
    public java.lang.String getPosnr() {
        return posnr;
    }


    /**
     * Sets the posnr value for this ZssdPosSfSap.
     * 
     * @param posnr
     */
    public void setPosnr(java.lang.String posnr) {
        this.posnr = posnr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZssdPosSfSap)) return false;
        ZssdPosSfSap other = (ZssdPosSfSap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zzpossf==null && other.getZzpossf()==null) || 
             (this.zzpossf!=null &&
              this.zzpossf.equals(other.getZzpossf()))) &&
            ((this.posnr==null && other.getPosnr()==null) || 
             (this.posnr!=null &&
              this.posnr.equals(other.getPosnr())));
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
        if (getZzpossf() != null) {
            _hashCode += getZzpossf().hashCode();
        }
        if (getPosnr() != null) {
            _hashCode += getPosnr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZssdPosSfSap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdPosSfSap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzpossf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zzpossf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Posnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
