package org.manager.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ESTATE")
public class Estate {
    private Integer IdEstate;
    private String Type;
    private Float Area;
    private Date DateBuilding;
    private Adress Adress;


    public Estate(){}

    public Estate(String type, Float area, Date dateBuilding, Adress adress) {
        Type = type;
        Area = area;
        DateBuilding = dateBuilding;
        Adress = adress;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Integer getIdEstate() {
        return IdEstate;
    }

    public void setIdEstate(Integer idEstate) {
        IdEstate = idEstate;
    }

    @Column(name = "TYPE")
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Column(name = "AREA")
    public Float getArea() {
        return Area;
    }

    public void setArea(Float area) {
        Area = area;
    }

    @Column(name = "DATEBUILDING")
    public Date getDateBuilding() {
        return DateBuilding;
    }

    public void setDateBuilding(Date dateBuilding) {
        DateBuilding = dateBuilding;
    }

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name= "ADRESS_ID")
    public Adress getAdress() {
        return Adress;
    }

    public void setAdress(Adress adress) {
        Adress = adress;
    }
    @Override
    public String toString(){
        return "Объект типа "+this.Type+", площадью: "+this.Area+", "+this.DateBuilding+" года строительства";
    }
}
