/**
 * ZssdPedidoCond.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZssdPedidoCond  implements java.io.Serializable {
    private java.lang.String zzpossf;

    private java.lang.String kschl;

    private java.lang.String kmein;

    private java.math.BigDecimal kbetr;

    private java.math.BigDecimal kpein;

    public ZssdPedidoCond() {
    }

    public ZssdPedidoCond(
           java.lang.String zzpossf,
           java.lang.String kschl,
           java.lang.String kmein,
           java.math.BigDecimal kbetr,
           java.math.BigDecimal kpein) {
           this.zzpossf = zzpossf;
           this.kschl = kschl;
           this.kmein = kmein;
           this.kbetr = kbetr;
           this.kpein = kpein;
    }


    /**
     * Gets the zzpossf value for this ZssdPedidoCond.
     * 
     * @return zzpossf
     */
    public java.lang.String getZzpossf() {
        return zzpossf;
    }


    /**
     * Sets the zzpossf value for this ZssdPedidoCond.
     * 
     * @param zzpossf
     */
    public void setZzpossf(java.lang.String zzpossf) {
        this.zzpossf = zzpossf;
    }


    /**
     * Gets the kschl value for this ZssdPedidoCond.
     * 
     * @return kschl
     */
    public java.lang.String getKschl() {
        return kschl;
    }


    /**
     * Sets the kschl value for this ZssdPedidoCond.
     * 
     * @param kschl
     */
    public void setKschl(java.lang.String kschl) {
        this.kschl = kschl;
    }


    /**
     * Gets the kmein value for this ZssdPedidoCond.
     * 
     * @return kmein
     */
    public java.lang.String getKmein() {
        return kmein;
    }


    /**
     * Sets the kmein value for this ZssdPedidoCond.
     * 
     * @param kmein
     */
    public void setKmein(java.lang.String kmein) {
        this.kmein = kmein;
    }


    /**
     * Gets the kbetr value for this ZssdPedidoCond.
     * 
     * @return kbetr
     */
    public java.math.BigDecimal getKbetr() {
        return kbetr;
    }


    /**
     * Sets the kbetr value for this ZssdPedidoCond.
     * 
     * @param kbetr
     */
    public void setKbetr(java.math.BigDecimal kbetr) {
        this.kbetr = kbetr;
    }


    /**
     * Gets the kpein value for this ZssdPedidoCond.
     * 
     * @return kpein
     */
    public java.math.BigDecimal getKpein() {
        return kpein;
    }


    /**
     * Sets the kpein value for this ZssdPedidoCond.
     * 
     * @param kpein
     */
    public void setKpein(java.math.BigDecimal kpein) {
        this.kpein = kpein;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZssdPedidoCond)) return false;
        ZssdPedidoCond other = (ZssdPedidoCond) obj;
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
            ((this.kschl==null && other.getKschl()==null) || 
             (this.kschl!=null &&
              this.kschl.equals(other.getKschl()))) &&
            ((this.kmein==null && other.getKmein()==null) || 
             (this.kmein!=null &&
              this.kmein.equals(other.getKmein()))) &&
            ((this.kbetr==null && other.getKbetr()==null) || 
             (this.kbetr!=null &&
              this.kbetr.equals(other.getKbetr()))) &&
            ((this.kpein==null && other.getKpein()==null) || 
             (this.kpein!=null &&
              this.kpein.equals(other.getKpein())));
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
        if (getKschl() != null) {
            _hashCode += getKschl().hashCode();
        }
        if (getKmein() != null) {
            _hashCode += getKmein().hashCode();
        }
        if (getKbetr() != null) {
            _hashCode += getKbetr().hashCode();
        }
        if (getKpein() != null) {
            _hashCode += getKpein().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZssdPedidoCond.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdPedidoCond"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzpossf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zzpossf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kschl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Kschl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kmein");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Kmein"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kbetr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Kbetr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kpein");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Kpein"));
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
