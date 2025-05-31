package uap.models;
import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, MassCalculatable, MassConverter, ShippingCostCalculator, PiRequired {
    private double majorRadius; // R
    private double minorRadius; // r

    public Torus() {
        super("Torus");
        this.majorRadius = 1;
        this.minorRadius = 0.5;
    }

    public Torus(double majorRadius, double minorRadius) {
        super("Torus");
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
    public double gramToKilogram(double massInGram) {
        return massInGram / DENOMINATOR;
    }

    @Override
    public double calculateCost(double massInKilogram) {
        return Math.ceil(massInKilogram) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
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
