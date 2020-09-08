package se.lexicon.michelle.restappfirstlook.model;

import java.util.Objects;

public class Pen {

    private int id;
    private String name;
    private String barCode;
    private String brand;

    public Pen(int id, String name, String barCode, String brand) {
        this.id = id;
        this.name = name;
        this.barCode = barCode;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return id == pen.id &&
                Objects.equals(name, pen.name) &&
                Objects.equals(barCode, pen.barCode) &&
                Objects.equals(brand, pen.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, barCode, brand);
    }

    @Override
    public String toString() {
        return "Pen{" + "id=" + id +
                ", name='" + name + '\'' +
                ", barCode='" + barCode + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
