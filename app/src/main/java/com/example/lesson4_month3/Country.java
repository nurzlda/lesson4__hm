package com.example.lesson4_month3;

public class Country {
    private String country;
    private String capital;
    private String flag;

    public Country(String country, String capital, String flag) {
        this.country = country;
        this.capital = capital;
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
