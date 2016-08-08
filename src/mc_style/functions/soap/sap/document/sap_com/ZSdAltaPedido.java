/**
 * ZSdAltaPedido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZSdAltaPedido  implements java.io.Serializable {
    private mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCab ICabecera;

    private mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCond[] TCondiciones;

    private functions.rfc.sap.document.sap_com.ZSSD_PEDIDO_POS[] TPosiciones;

    private mc_style.functions.soap.sap.document.sap_com.ZssdTextos[] TTextos;

    private mc_style.functions.soap.sap.document.sap_com.ZssdTipoCambio[] TTipocambio;

    public ZSdAltaPedido() {
    }

    public ZSdAltaPedido(
           mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCab ICabecera,
           mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCond[] TCondiciones,
           functions.rfc.sap.document.sap_com.ZSSD_PEDIDO_POS[] TPosiciones,
           mc_style.functions.soap.sap.document.sap_com.ZssdTextos[] TTextos,
           mc_style.functions.soap.sap.document.sap_com.ZssdTipoCambio[] TTipocambio) {
           this.ICabecera = ICabecera;
           this.TCondiciones = TCondiciones;
           this.TPosiciones = TPosiciones;
           this.TTextos = TTextos;
           this.TTipocambio = TTipocambio;
    }


    /**
     * Gets the ICabecera value for this ZSdAltaPedido.
     * 
     * @return ICabecera
     */
    public mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCab getICabecera() {
        return ICabecera;
    }


    /**
     * Sets the ICabecera value for this ZSdAltaPedido.
     * 
     * @param ICabecera
     */
    public void setICabecera(mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCab ICabecera) {
        this.ICabecera = ICabecera;
    }


    /**
     * Gets the TCondiciones value for this ZSdAltaPedido.
     * 
     * @return TCondiciones
     */
    public mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCond[] getTCondiciones() {
        return TCondiciones;
    }


    /**
     * Sets the TCondiciones value for this ZSdAltaPedido.
     * 
     * @param TCondiciones
     */
    public void setTCondiciones(mc_style.functions.soap.sap.document.sap_com.ZssdPedidoCond[] TCondiciones) {
        this.TCondiciones = TCondiciones;
    }


    /**
     * Gets the TPosiciones value for this ZSdAltaPedido.
     * 
     * @return TPosiciones
     */
    public functions.rfc.sap.document.sap_com.ZSSD_PEDIDO_POS[] getTPosiciones() {
        return TPosiciones;
    }


    /**
     * Sets the TPosiciones value for this ZSdAltaPedido.
     * 
     * @param TPosiciones
     */
    public void setTPosiciones(functions.rfc.sap.document.sap_com.ZSSD_PEDIDO_POS[] TPosiciones) {
        this.TPosiciones = TPosiciones;
    }


    /**
     * Gets the TTextos value for this ZSdAltaPedido.
     * 
     * @return TTextos
     */
    public mc_style.functions.soap.sap.document.sap_com.ZssdTextos[] getTTextos() {
        return TTextos;
    }


    /**
     * Sets the TTextos value for this ZSdAltaPedido.
     * 
     * @param TTextos
     */
    public void setTTextos(mc_style.functions.soap.sap.document.sap_com.ZssdTextos[] TTextos) {
        this.TTextos = TTextos;
    }


    /**
     * Gets the TTipocambio value for this ZSdAltaPedido.
     * 
     * @return TTipocambio
     */
    public mc_style.functions.soap.sap.document.sap_com.ZssdTipoCambio[] getTTipocambio() {
        return TTipocambio;
    }


    /**
     * Sets the TTipocambio value for this ZSdAltaPedido.
     * 
     * @param TTipocambio
     */
    public void setTTipocambio(mc_style.functions.soap.sap.document.sap_com.ZssdTipoCambio[] TTipocambio) {
        this.TTipocambio = TTipocambio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSdAltaPedido)) return false;
        ZSdAltaPedido other = (ZSdAltaPedido) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICabecera==null && other.getICabecera()==null) || 
             (this.ICabecera!=null &&
              this.ICabecera.equals(other.getICabecera()))) &&
            ((this.TCondiciones==null && other.getTCondiciones()==null) || 
             (this.TCondiciones!=null &&
              java.util.Arrays.equals(this.TCondiciones, other.getTCondiciones()))) &&
            ((this.TPosiciones==null && other.getTPosiciones()==null) || 
             (this.TPosiciones!=null &&
              java.util.Arrays.equals(this.TPosiciones, other.getTPosiciones()))) &&
            ((this.TTextos==null && other.getTTextos()==null) || 
             (this.TTextos!=null &&
              java.util.Arrays.equals(this.TTextos, other.getTTextos()))) &&
            ((this.TTipocambio==null && other.getTTipocambio()==null) || 
             (this.TTipocambio!=null &&
              java.util.Arrays.equals(this.TTipocambio, other.getTTipocambio())));
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
        if (getICabecera() != null) {
            _hashCode += getICabecera().hashCode();
        }
        if (getTCondiciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCondiciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCondiciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPosiciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTPosiciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTPosiciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTTextos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTTextos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTTextos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTTipocambio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTTipocambio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTTipocambio(), i);
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
        new org.apache.axis.description.TypeDesc(ZSdAltaPedido.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", ">ZSdAltaPedido"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICabecera");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ICabecera"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdPedidoCab"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCondiciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TCondiciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdPedidoCond"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPosiciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TPosiciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSSD_PEDIDO_POS"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TTextos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TTextos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdTextos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TTipocambio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TTipocambio"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZssdTipoCambio"));
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
