//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.27 at 08:53:01 PM MEZ 
//

package de.openstreetmap.josm.tagging_preset_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for combo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="combo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="short_description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="text_context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="values" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="values_context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="display_values" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="delete_if_empty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "combo", propOrder = { "shortDescription" })
public class Combo {

    @XmlElement(name = "short_description")
    protected List<String> shortDescription;
    @XmlAttribute(required = true)
    protected String key;
    @XmlAttribute
    protected String text;
    @XmlAttribute(name = "text_context")
    protected String textContext;
    @XmlAttribute(required = true)
    protected String values;
    @XmlAttribute(name = "values_context")
    protected String valuesContext;
    @XmlAttribute(name = "display_values")
    protected String displayValues;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute
    protected Boolean editable;
    @XmlAttribute(name = "delete_if_empty")
    protected Boolean deleteIfEmpty;
    @XmlAttribute
    protected Boolean required;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the shortDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the shortDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getShortDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getShortDescription() {
        if (shortDescription == null) {
            shortDescription = new ArrayList<String>();
        }
        return this.shortDescription;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textContext property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTextContext() {
        return textContext;
    }

    /**
     * Sets the value of the textContext property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTextContext(String value) {
        this.textContext = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValues(String value) {
        this.values = value;
    }

    /**
     * Gets the value of the valuesContext property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValuesContext() {
        return valuesContext;
    }

    /**
     * Sets the value of the valuesContext property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValuesContext(String value) {
        this.valuesContext = value;
    }

    /**
     * Gets the value of the displayValues property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDisplayValues() {
        return displayValues;
    }

    /**
     * Sets the value of the displayValues property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDisplayValues(String value) {
        this.displayValues = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the deleteIfEmpty property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isDeleteIfEmpty() {
        return deleteIfEmpty;
    }

    /**
     * Sets the value of the deleteIfEmpty property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setDeleteIfEmpty(Boolean value) {
        this.deleteIfEmpty = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed
     * property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and the value is the string
     * value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute by
     * updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
