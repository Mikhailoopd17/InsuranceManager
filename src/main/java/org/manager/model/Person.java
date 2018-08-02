package org.manager.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "PERSONS")
public class Person{
    private Integer IdPerson;
    private String Fio;
    private Date Birth;
    private String Passport;    // пока String, в планах хотел сделать объект в виде компонента

    private List<Contract> contractList;

    public Person(){}

    public Person(String fio, Date birth, String passport) {
        this.Fio = fio;
        this.Birth = birth;
        this.Passport = passport;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Integer getIdPerson() {
        return this.IdPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.IdPerson = idPerson;
    }
    @Column(name = "FIO")
    public String getFio() {
        return this.Fio;
    }

    public void setFio(String fio) {
        this.Fio = fio;
    }

    @Column(name="BIRTH")
    @Temporal(value=TemporalType.DATE)
    public Date getBirth() {
        return this.Birth;
    }

    public void setBirth(Date birth) {
        this.Birth = birth;
    }

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
    public List<Contract> getContractList() {
        return this.contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public String getPassport() {
        return Passport;
    }

    public void setPassport(String passport) {
        Passport = passport;
    }

    @Override
    public String toString(){
        return "Клиент №"+IdPerson+", ФИО: "+Fio+", "+Birth.toString()+" г.р.";
    }

}
