package dk.si.covid.model;

public class Country {

    private String name;
    private String Color;

    public Country(String name, String color) {
        this.name = name;
        Color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}