//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.27 at 08:53:01 PM MEZ 
//

package de.openstreetmap.josm.tagging_preset_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the de.openstreetmap.josm.tagging_preset_1
 * package.
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

    private final static QName _Annotations_QNAME = new QName(
            "http://josm.openstreetmap.de/tagging-preset-1.0", "annotations");
    private final static QName _Presets_QNAME = new QName(
            "http://josm.openstreetmap.de/tagging-preset-1.0", "presets");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * de.openstreetmap.josm.tagging_preset_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link Roles }
     * 
     */
    public Roles createRoles() {
        return new Roles();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Optional }
     * 
     */
    public Optional createOptional() {
        return new Optional();
    }

    /**
     * Create an instance of {@link Combo }
     * 
     */
    public Combo createCombo() {
        return new Combo();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link Separator }
     * 
     */
    public Separator createSeparator() {
        return new Separator();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link Space }
     * 
     */
    public Space createSpace() {
        return new Space();
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Multiselect }
     * 
     */
    public Multiselect createMultiselect() {
        return new Multiselect();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Root }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://josm.openstreetmap.de/tagging-preset-1.0", name = "annotations")
    public JAXBElement<Root> createAnnotations(Root value) {
        return new JAXBElement<Root>(_Annotations_QNAME, Root.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Root }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://josm.openstreetmap.de/tagging-preset-1.0", name = "presets")
    public JAXBElement<Root> createPresets(Root value) {
        return new JAXBElement<Root>(_Presets_QNAME, Root.class, null, value);
    }

}
