package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, MassCalculatable, MassConverter, ShippingCostCalculator, PiRequired {
    private double radius;

    public Sphere(){
        super("Sphere");
        this.radius = 1.0;
    }

    public Sphere(double radius){
        super("Sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double getThickness() {
        return THICKNESS;
    }

    @Override
    public double gramToKilogram(double massInGram) {
        return massInGram / DENOMINATOR;
    }

    @Override
    public double calculateCost(double massInKilogram) {
        return Math.ceil(massInKilogram) * PRICE_PER_KG;
    }

    public void printInfo(){
        double volume = getVolume();
        double surfaceArea = getSurfaceArea();
        double massInGram = getMass();
        double massInKg = gramToKilogram(massInGram);
        double shippingCost = calculateCost(massInKg);

        System.out.printf("%-15s: %.2f cm^3\n","Volume", volume);
        System.out.printf("%-15s: %.2f cm^2\n","Luas permukaan", surfaceArea);
        System.out.printf("%-15s: %.2f gr\n","Massa", massInGram);
        System.out.printf("%-15s: %.4f kg\n","Massa dalam kg", massInKg);
        System.out.printf("%-15s: Rp%.2f\n","Biaya kirim", shippingCost);
    }
}
