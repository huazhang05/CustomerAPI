package ca.vanier.customer_lib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import ca.vanier.address_lib.entity.Address;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String email;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Address_Id",referencedColumnName = "Id")//connect these two columns 
    private Address address;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
