package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, MassCalculatable, MassConverter, ShippingCostCalculator, PiRequired {
    private double radius;

    public Sphere(){
        this.radius = 1.0;
    }

    public Sphere(double radius){
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
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;

    }

    public void printInfo(){
        double volume = getVolume();
        double surfaceArea = getSurfaceArea();
        double massInGram = getMass();


        System.out.printf("%-15s: %.2f\n","Volume", volume);
        System.out.printf("%-15s: %.2f\n","Luas permukaan", surfaceArea);
        System.out.printf("%-15s: %.2f\n","Massa", massInGram);

    }
}
