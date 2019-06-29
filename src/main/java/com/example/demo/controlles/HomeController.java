package com.example.demo.controlles;

import javax.inject.Named;

@Named
public class HomeController {

    private String name;
    private String surname;
    private String yearBirthday;
    private String numberPassport;
    private String country;
    private String city;
    private String countPeople;
    private String periodOfResidenceBegin;
    private String periodOfResidenceEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(String yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(String countPeople) {
        this.countPeople = countPeople;
    }

    public String getPeriodOfResidenceBegin() {
        return periodOfResidenceBegin;
    }

    public void setPeriodOfResidenceBegin(String periodOfResidenceBegin) {
        this.periodOfResidenceBegin = periodOfResidenceBegin;
    }

    public String getPeriodOfResidenceEnd() {
        return periodOfResidenceEnd;
    }

    public void setPeriodOfResidenceEnd(String periodOfResidenceEnd) {
        this.periodOfResidenceEnd = periodOfResidenceEnd;
    }

    public String moveToQuestionAboutPersonalData() {
        return "personalData.xhtml?faces-redirect=true&name=";
    }

    public String moveToQuestionAboutDataForHotel() {
        return "dataForHotel.xhtml?faces-redirect=true&name=";
    }

    public String moveToQuestionAboutControl() {
        return "control.xhtml?faces-redirect=true&name=";
    }

    public String moveToLastPage() {
        return "lastPage.xhtml?faces-redirect=true&name=";
    }
}
