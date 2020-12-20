package dk.si.covid.model;

public class Country {

    private String country;
    private String color;

    public Country(String country, String color) {
        this.country = country;
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}