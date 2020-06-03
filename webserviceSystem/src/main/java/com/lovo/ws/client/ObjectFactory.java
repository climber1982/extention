
package com.lovo.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lovo.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PushMessageResponse_QNAME = new QName("http://service.ws.lovo.com/", "pushMessageResponse");
    private final static QName _PushMessage_QNAME = new QName("http://service.ws.lovo.com/", "pushMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lovo.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PushMessage }
     * 
     */
    public PushMessage createPushMessage() {
        return new PushMessage();
    }

    /**
     * Create an instance of {@link PushMessageResponse }
     * 
     */
    public PushMessageResponse createPushMessageResponse() {
        return new PushMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.lovo.com/", name = "pushMessageResponse")
    public JAXBElement<PushMessageResponse> createPushMessageResponse(PushMessageResponse value) {
        return new JAXBElement<PushMessageResponse>(_PushMessageResponse_QNAME, PushMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.lovo.com/", name = "pushMessage")
    public JAXBElement<PushMessage> createPushMessage(PushMessage value) {
        return new JAXBElement<PushMessage>(_PushMessage_QNAME, PushMessage.class, null, value);
    }

}
