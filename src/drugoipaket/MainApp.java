package drugoipaket;

import kz.aitu.dz.Smartphone;

public class MainApp {
    public static void main(String[] args) {
        Smartphone samsungGalaxy = new Smartphone();

        // setters
        samsungGalaxy.setModel("Samsung Galaxy S21");
        samsungGalaxy.setYear(2021);
        samsungGalaxy.setPrice(999.99);

        // getters
        String model = samsungGalaxy.getModel();
        int year = samsungGalaxy.getYear();
        double price = samsungGalaxy.getPrice();

        // Displaying
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}