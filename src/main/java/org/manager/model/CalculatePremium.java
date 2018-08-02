package org.manager.model;


import antlr.StringUtils;

public class CalculatePremium {

    private Integer Premium;

    public CalculatePremium(Contract contract) {
        try {
            Premium = (int) Math.ceil(contract.getSum() * setKpl(contract) * setKgp(contract) * setTt(contract) / (contract.getDateLast().getTime() / 86400000 - contract.getDateFirst().getTime() / 86400000));
        } catch (ArithmeticException e) {
            Premium = 0;
        }
    }

    //методы для назначения коэффициентов расчета премии
    private float setKpl(Contract contract) {
        if (contract.getEstate().getArea() < 50)
            return 1.2F;
        else if (contract.getEstate().getArea() >= 50 && contract.getEstate().getArea() < 100)
            return 1.5F;
        else
            return 2.0F;
    }

    private float setKgp(Contract contract) {
        if (contract.getEstate().getDateBuilding().getTime() + 1900 < 2000)
            return 1.3F;
        else if (contract.getEstate().getDateBuilding().getYear() + 1900 >= 2000 && contract.getEstate().getDateBuilding().getYear() + 1900 < 2014)
            return 1.6F;
        else
            return 2.0F;
    }

    private float setTt(Contract contract) {
        String string = StringUtils.stripFrontBack(contract.getEstate().getType().toLowerCase(), " ", " ");;
        String kvart = "квартира";
        String dom = "дом";
        String komn = "комната";

        if (string.equals(kvart))
            return 1.7F;
        else if (string.equals(dom))
            return 1.5F;
        else if (string.equals(komn))
            return 1.3F;
        else
            return 1.0F;
    }

    public Integer getPremium() {
        return Premium;
    }

}


