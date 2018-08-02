package org.manager.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CRDC") //CRDC - country/region/district/city
public class CRDC {
    private Integer ID;
    private String Country;
    private String Region;
    private String District;
    private String City;

    private List<Adress> adressList;

    public CRDC(String country, String region, String district, String city) {
        Country = country;
        Region = region;
        District = district;
        City = city;
    }

    public CRDC() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Column(name = "COUNTRY")
    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Column(name = "REGION")
    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    @Column(name = "DISTRICT")
    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    @Column(name = "CITY")
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @OneToMany(mappedBy = "CRDC", fetch = FetchType.EAGER)
    public List<Adress> getAdressList() {
        return adressList;
    }

    public void setAdressList(List<Adress> adressList) {
        this.adressList = adressList;
    }



}
