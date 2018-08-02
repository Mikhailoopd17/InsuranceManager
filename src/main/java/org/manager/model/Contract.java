package org.manager.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTRACTS")
public class Contract {
    private Integer IdContract;
    private Integer Sum;
    private Integer Premium;
    private Date DateFirst;
    private Date DateLast;
    private Date DateCalc;
    private Person Person;
    private Estate Estate;


    public Contract(){}

    public Contract(Integer sum, Date dateFirst, Date dateLast, Person person, Estate estate) {
        this.Sum = sum;
        this.DateFirst = dateFirst;
        this.DateLast = dateLast;
        this.DateCalc = new Date();
        this.Person = person;
        this.Estate = estate;
        this.Premium = new CalculatePremium(Contract.this).getPremium();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Integer getId() {
        return IdContract;
    }

    public void setId(Integer id) {
        IdContract = id;
    }
    @Column(name = "SUM")
    public Integer getSum() {
        return Sum;
    }

    public void setSum(Integer sum) {
        Sum = sum;
    }

    @Column(name = "PREMIUM")
    public Integer getPremium() {
        return Premium;
    }

    public void setPremium(Integer premium){
        this.Premium = premium;
    }

    private void setPremium() {
        Premium = new CalculatePremium(Contract.this).getPremium();
    }

    @Column(name = "DATEFIRST")
    @Temporal(value = TemporalType.DATE)
    public Date getDateFirst() {
        return DateFirst;
    }

    public void setDateFirst(Date dateFirst) {
        DateFirst = dateFirst;
    }

    @Column(name = "DATELAST")
    @Temporal(value = TemporalType.DATE)
    public Date getDateLast() {
        return DateLast;
    }

    public void setDateLast(Date dateLast) {
        DateLast = dateLast;
    }

    @Column(name = "DATECALC")
    @Temporal(value = TemporalType.DATE)
    public Date getDateCalc() {
        return DateCalc;
    }

    public void setDateCalc(Date dateCalc) {
        DateCalc = dateCalc;
    }


    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name= "PERSON_ID")
    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person person) {
        Person = person;
    }

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name= "ESTATE_ID")
    public Estate getEstate() {
        return Estate;
    }

    public void setEstate(Estate estate) {
        Estate = estate;
    }

    @Override
    public String toString(){
        return "Контракт № "+this.IdContract+"Сумма:  "+this.Sum+", премия:"+Premium;
    }

}
