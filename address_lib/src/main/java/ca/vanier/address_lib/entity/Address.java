package ca.vanier.address_lib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private long Id;    
    private String stNumber;
    private String stName;
    private String city;
    private String province;
    private String postCode;
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getStNumber() {
        return stNumber;
    }
    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }
    public String getStName() {
        return stName;
    }
    public void setStName(String stName) {
        this.stName = stName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
