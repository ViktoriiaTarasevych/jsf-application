package com.example.demo.controlles;

import javax.inject.Named;

@Named
public class HomeController {

    private String name;

    private String surname;

    private String yearBirthday;

    private String numberPassport;

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(String yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

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

    public String sayHello1() {
        return "hello.xhtml?faces-redirect=true&name=" + name;
    }

    public String sayHello3() {
        return "personalData.xhtml?faces-redirect=true&name=" + name;
    }

}
