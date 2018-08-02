package org.manager.model.Component;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class PassportComponent implements Serializable {

    private Integer Series;
    private Integer Number;

    private String passport;

    public PassportComponent(){}

    public PassportComponent(Integer series, Integer number) {
        this.Series = series;
        this.Number = number;
    }

    public Integer Series() {
        return Series;
    }

    public void setSeries(Integer series) {
        this.Series = series;
    }

    public Integer Number() {
        return Number;
    }

    public void setNumber(Integer number) {
        this.Number = number;
    }

    @Override
    public String toString(){
        return "Паспорт серия: "+this.Series+", номер: "+this.Number;
    }


    public String getPassport() {
        return this.Series +"-"+this.Number;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

}

