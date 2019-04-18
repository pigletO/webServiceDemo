package com.pigletO.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.pigletO.client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ServiceOneResponse_QNAME = new QName(
			"http://server.pigletO.com/", "serviceOneResponse");
	private final static QName _ServiceOne_QNAME = new QName(
			"http://server.pigletO.com/", "serviceOne");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.pigletO.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ServiceOneResponse }
	 * 
	 */
	public ServiceOneResponse createServiceOneResponse() {
		return new ServiceOneResponse();
	}

	/**
	 * Create an instance of {@link ServiceOne }
	 * 
	 */
	public ServiceOne createServiceOne() {
		return new ServiceOne();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ServiceOneResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://server.pigletO.com/", name = "serviceOneResponse")
	public JAXBElement<ServiceOneResponse> createServiceOneResponse(
			ServiceOneResponse value) {
		return new JAXBElement<ServiceOneResponse>(_ServiceOneResponse_QNAME,
				ServiceOneResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOne }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://server.pigletO.com/", name = "serviceOne")
	public JAXBElement<ServiceOne> createServiceOne(ServiceOne value) {
		return new JAXBElement<ServiceOne>(_ServiceOne_QNAME, ServiceOne.class,
				null, value);
	}

}
