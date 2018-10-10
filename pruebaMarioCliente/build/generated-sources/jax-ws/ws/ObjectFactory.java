
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Administrador_QNAME = new QName("http://ws/", "administrador");
    private final static QName _Cancha_QNAME = new QName("http://ws/", "cancha");
    private final static QName _Equipo_QNAME = new QName("http://ws/", "equipo");
    private final static QName _OperationResponse_QNAME = new QName("http://ws/", "operationResponse");
    private final static QName _Reto_QNAME = new QName("http://ws/", "reto");
    private final static QName _Operation_QNAME = new QName("http://ws/", "operation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Administrador }
     * 
     */
    public Administrador createAdministrador() {
        return new Administrador();
    }

    /**
     * Create an instance of {@link Cancha }
     * 
     */
    public Cancha createCancha() {
        return new Cancha();
    }

    /**
     * Create an instance of {@link Equipo }
     * 
     */
    public Equipo createEquipo() {
        return new Equipo();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link Reto }
     * 
     */
    public Reto createReto() {
        return new Reto();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Administrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "administrador")
    public JAXBElement<Administrador> createAdministrador(Administrador value) {
        return new JAXBElement<Administrador>(_Administrador_QNAME, Administrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cancha")
    public JAXBElement<Cancha> createCancha(Cancha value) {
        return new JAXBElement<Cancha>(_Cancha_QNAME, Cancha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "equipo")
    public JAXBElement<Equipo> createEquipo(Equipo value) {
        return new JAXBElement<Equipo>(_Equipo_QNAME, Equipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reto")
    public JAXBElement<Reto> createReto(Reto value) {
        return new JAXBElement<Reto>(_Reto_QNAME, Reto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

}
