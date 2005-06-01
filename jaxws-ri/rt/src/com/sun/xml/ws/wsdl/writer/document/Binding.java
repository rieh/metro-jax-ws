
package com.sun.xml.ws.wsdl.writer.document;

import javax.xml.namespace.QName;
import com.sun.xml.txw2.TypedXmlWriter;
import com.sun.xml.txw2.annotation.XmlAttribute;
import com.sun.xml.txw2.annotation.XmlElement;
import com.sun.xml.ws.wsdl.writer.document.soap.SOAPBinding;


@XmlElement("binding")
public interface Binding
    extends TypedXmlWriter, StartWithExtensionsType
{


    @XmlAttribute
    public com.sun.xml.ws.wsdl.writer.document.Binding type(QName value);

    @XmlAttribute
    public com.sun.xml.ws.wsdl.writer.document.Binding name(String value);

    @XmlElement
    public BindingOperationType operation();

    @XmlElement(value="soapBinding",ns="http://schemas.xmlsoap.org/wsdl/soap/")
    public SOAPBinding soapBinding();

}
