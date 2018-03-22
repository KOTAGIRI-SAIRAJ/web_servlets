package com.training.inheritance;

public class SoftwareCompany {

    private String companyName;
    private String typeOfCompany;

    public void getCompanyName() {
        System.out.println("Software Company Name: "+companyName);
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void getTypeOfCompany() {
        System.out.println("Software Company Type: "+typeOfCompany);
    }

    public void setTypeOfCompany(String typeOfCompany) {
        this.typeOfCompany = typeOfCompany;
    }

}
