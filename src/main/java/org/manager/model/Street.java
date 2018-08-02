package org.manager.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "STREET")
public class Street {
    private Integer ID;
    private String Street;
    private List<Adress> adressList;

    public Street(String street) {
        this.Street = street;
    }

    public Street() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Column(name = "STREET")
    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        this.Street = street;
    }

    @OneToMany(mappedBy = "street", fetch = FetchType.EAGER)
    public List<Adress> getAdressList() {
        return adressList;
    }

    public void setAdressList(List<Adress> adressList) {
        this.adressList = adressList;
    }
}
