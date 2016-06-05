package com.exist.model;

import javax.persistence.CascadeType;
import com.exist.model.enums.ContactType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Contact")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="person")
public class Contact extends BaseEntity{
    private ContactType contactType;
    private String value;
    private Person person;
    
    public Contact(){}
    
    public Contact(ContactType contactType, String value){
        this.contactType = contactType;
        this.value = value;
    }
    
    @Column(name = "contact_type")
    @Enumerated(EnumType.STRING) 
    public ContactType getContactType(){
        return contactType;
    }
    
    public void setContactType(ContactType contactType){
        this.contactType = contactType;
    }
    
    @Column(name = "value")
    public String getValue(){
        return value;
    }
    
    public void setValue(String value){
        this.value = value;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "person_id")
    @Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
    public Person getPerson(){
        return person;
    }
    
    public void setPerson(Person person){
        this.person = person;
    }
    
    @Override
    public int hashCode() {
        HashCodeBuilder hcb = new HashCodeBuilder();
        hcb.append(value);
        return hcb.toHashCode();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact otherContact = (Contact) obj;
        EqualsBuilder eb = new EqualsBuilder();
        eb.append(value, otherContact.getValue());
        return eb.isEquals();
    }
}