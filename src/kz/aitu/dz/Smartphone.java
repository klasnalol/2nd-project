package kz.aitu.dz;
public class Smartphone {
    private String model;
    private int year;
    private double price;

    public String getModel() {
        System.out.println("Getter for model was called");
        return model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else {
            System.err.println("Error null");
        }
    }

    public int getYear() {
        System.out.println("Getter for year was called");
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        System.out.println("Getter for price was called");
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}