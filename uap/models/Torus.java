package uap.models;
import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, MassCalculatable, MassConverter, ShippingCostCalculator, PiRequired {
    private double majorRadius; // R
    private double minorRadius; // r

    public Torus() {
        this.majorRadius = 1;
        this.minorRadius = 0.5;
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
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

    @Override
    public void printInfo() {
        double volume = getVolume();
        double surfaceArea = getSurfaceArea();
        double massInGram = getMass();

        System.out.printf("%-15s: %.2f\n","Volume", volume);
        System.out.printf("%-15s: %.2f\n","Luas permukaan", surfaceArea);
        System.out.printf("%-15s: %.2f\n","Massa", massInGram);

    }
}
