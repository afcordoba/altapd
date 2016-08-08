/**
 * ZssdTextos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZssdTextos  implements java.io.Serializable {
    private java.lang.String textId;

    private java.lang.String langu;

    private java.lang.String textLine;

    public ZssdTextos() {
    }

    public ZssdTextos(
           java.lang.String textId,
           java.lang.String langu,
           java.lang.String textLine) {
           this.textId = textId;
           this.langu = langu;
           this.textLine = textLine;
    }


    /**
     * Gets the textId value for this ZssdTextos.
     * 
     * @return textId
     */
    public java.lang.String getTextId() {
        return textId;
    }


    /**
     * Sets the textId value for this ZssdTextos.
     * 
     * @param textId
     */
    public void setTextId(java.lang.String textId) {
        this.textId = textId;
    }


    /**
     * Gets the langu value for this ZssdTextos.
     * 
     * @return langu
     */
    public java.lang.String getLangu() {
        return langu;
    }


    /**
     * Sets the langu value for this ZssdTextos.
     * 
     * @param langu
     */
    public void setLangu(java.lang.String langu) {
        this.langu = langu;
    }


    /**
     * Gets the textLine value for this ZssdTextos.
     * 
     * @return textLine
     */
    public java.lang.String getTextLine() {
        return textLine;
    }


    /**
     * Sets the textLine value for this ZssdTextos.
     * 
     * @param textLine
     */
    public void setTextLine(java.lang.String textLine) {
        this.textLine = textLine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZssdTextos)) return false;
        ZssdTextos other = (ZssdTextos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.textId==null && other.getTextId()==null) || 
             (this.textId!=null &&
              this.textId.equals(other.getTextId()))) &&
            ((this.langu==null && other.getLangu()==null) || 
             (this.langu!=null &&
              this.langu.equals(other.getLangu()))) &&
            ((this.textLine==null && other.getTextLine()==null) || 
             (this.textLine!=null &&
              this.textLine.equals(other.getTextLine())));
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
        if (getTextId() != null) {
            _hashCode += getTextId().hashCode();
        }
        if (getLangu() != null) {
            _hashCode += getLangu().hashCode();
        }
        if (getTextLine() != null) {
            _hashCode += getTextLine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZssdTextos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdTextos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("langu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Langu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextLine"));
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
