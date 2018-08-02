package org.manager.model;

import javax.persistence.*;

@Entity
@Table(name = "ADRESS")
public class Adress {
    private Integer ID;
    private String Index;
    private CRDC CRDC;
    private Street Street;
    private Integer House;
    private String Housing;
    private String Building;
    private Integer Apartment;

    public Adress(){}

    public Adress(String index, CRDC crdc, Street street, Integer house, String housing, String building, Integer apartment) {
        Index = index;
        CRDC = crdc;
        Street = street;
        House = house;
        Housing = housing;
        Building = building;
        Apartment = apartment;
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

    @Column(name = "INDEXADRESS")
    public String getIndex() {
        return Index;
    }

    public void setIndex(String index) {
        Index = index;
    }

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name= "CRDC_ID")
    public CRDC getCRDC() {
        return CRDC;
    }

    public void setCRDC(CRDC CRDC) {
        this.CRDC = CRDC;
    }

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name= "STREET_ID")
    public Street getStreet() {
        return Street;
    }

    public void setStreet(Street street) {
        Street = street;
    }

    @Column(name = "HOUSE")
    public Integer getHouse() {
        return House;
    }

    public void setHouse(Integer house) {
        House = house;
    }

    @Column(name = "HOUSING")
    public String getHousing() {
        return Housing;
    }

    public void setHousing(String housing) {
        Housing = housing;
    }

    @Column(name = "BUILDING")
    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    @Column(name = "APARTMENT")
    public Integer getApartment() {
        return Apartment;
    }

    public void setApartment(Integer apartment) {
        Apartment = apartment;
    }
}
