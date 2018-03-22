package com.training.inheritance;

public class HardwareCompany {
    private String companyName;
    private String typeOfCompany;
    private int totalStaff;

    public void getCompanyName() {
        System.out.println("Hardware Company Name: "+companyName);
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void getTypeOfCompany() {
        System.out.println("Hardware Company Type: "+typeOfCompany);
    }

    public void setTypeOfCompany(String typeOfCompany) {
        this.typeOfCompany = typeOfCompany;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public void getTotalStaff() {
        System.out.println("Hardware Company Staff: "+totalStaff);
    }
}
