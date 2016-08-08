/**
 * ZSdAltaPedidoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZSdAltaPedidoResponse  implements java.io.Serializable {
    private java.lang.String ENroPedido;

    private int ESubrc;

    private mc_style.functions.soap.sap.document.sap_com.ZssdPosSfSap[] TRelPos;

    private mc_style.functions.soap.sap.document.sap_com.Bapiret2[] TReturn;

    public ZSdAltaPedidoResponse() {
    }

    public ZSdAltaPedidoResponse(
           java.lang.String ENroPedido,
           int ESubrc,
           mc_style.functions.soap.sap.document.sap_com.ZssdPosSfSap[] TRelPos,
           mc_style.functions.soap.sap.document.sap_com.Bapiret2[] TReturn) {
           this.ENroPedido = ENroPedido;
           this.ESubrc = ESubrc;
           this.TRelPos = TRelPos;
           this.TReturn = TReturn;
    }


    /**
     * Gets the ENroPedido value for this ZSdAltaPedidoResponse.
     * 
     * @return ENroPedido
     */
    public java.lang.String getENroPedido() {
        return ENroPedido;
    }


    /**
     * Sets the ENroPedido value for this ZSdAltaPedidoResponse.
     * 
     * @param ENroPedido
     */
    public void setENroPedido(java.lang.String ENroPedido) {
        this.ENroPedido = ENroPedido;
    }


    /**
     * Gets the ESubrc value for this ZSdAltaPedidoResponse.
     * 
     * @return ESubrc
     */
    public int getESubrc() {
        return ESubrc;
    }


    /**
     * Sets the ESubrc value for this ZSdAltaPedidoResponse.
     * 
     * @param ESubrc
     */
    public void setESubrc(int ESubrc) {
        this.ESubrc = ESubrc;
    }


    /**
     * Gets the TRelPos value for this ZSdAltaPedidoResponse.
     * 
     * @return TRelPos
     */
    public mc_style.functions.soap.sap.document.sap_com.ZssdPosSfSap[] getTRelPos() {
        return TRelPos;
    }


    /**
     * Sets the TRelPos value for this ZSdAltaPedidoResponse.
     * 
     * @param TRelPos
     */
    public void setTRelPos(mc_style.functions.soap.sap.document.sap_com.ZssdPosSfSap[] TRelPos) {
        this.TRelPos = TRelPos;
    }


    /**
     * Gets the TReturn value for this ZSdAltaPedidoResponse.
     * 
     * @return TReturn
     */
    public mc_style.functions.soap.sap.document.sap_com.Bapiret2[] getTReturn() {
        return TReturn;
    }


    /**
     * Sets the TReturn value for this ZSdAltaPedidoResponse.
     * 
     * @param TReturn
     */
    public void setTReturn(mc_style.functions.soap.sap.document.sap_com.Bapiret2[] TReturn) {
        this.TReturn = TReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSdAltaPedidoResponse)) return false;
        ZSdAltaPedidoResponse other = (ZSdAltaPedidoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ENroPedido==null && other.getENroPedido()==null) || 
             (this.ENroPedido!=null &&
              this.ENroPedido.equals(other.getENroPedido()))) &&
            this.ESubrc == other.getESubrc() &&
            ((this.TRelPos==null && other.getTRelPos()==null) || 
             (this.TRelPos!=null &&
              java.util.Arrays.equals(this.TRelPos, other.getTRelPos()))) &&
            ((this.TReturn==null && other.getTReturn()==null) || 
             (this.TReturn!=null &&
              java.util.Arrays.equals(this.TReturn, other.getTReturn())));
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
        if (getENroPedido() != null) {
            _hashCode += getENroPedido().hashCode();
        }
        _hashCode += getESubrc();
        if (getTRelPos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTRelPos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTRelPos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSdAltaPedidoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", ">ZSdAltaPedidoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENroPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENroPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESubrc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESubrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRelPos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRelPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdPosSfSap"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Bapiret2"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
