package uap.mains;

import java.util.Scanner;
import uap.bases.Shape;
import uap.interfaces.MassConverter;
import uap.interfaces.ShippingCostCalculator;
import uap.models.*;

public class KalkulatorPabrik{
    public static void main(String[] args) {
        final String SEPARATOR = "=============================================";
        Scanner scan = new Scanner(System.in);


        System.out.println(SEPARATOR);
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("DIONISIUS SERAF SAPUTRA");
        System.out.println("245150701111011");
        System.out.println(SEPARATOR);

        System.out.println("Donat dengan lubang");
        System.out.println(SEPARATOR);
        System.out.printf("%-15s: ", "Isikan Radius");
        double majorRadiusTorus = scan.nextDouble();
        System.out.printf("%-15s: ", "Isikan radius");
        double minorRadiusTorus = scan.nextDouble();

        Shape donatLubang = new Torus(majorRadiusTorus, minorRadiusTorus);
        MassConverter donatLubangMass = new Torus(majorRadiusTorus, minorRadiusTorus);
        ShippingCostCalculator donatLubangShip = new Torus(majorRadiusTorus, minorRadiusTorus);
        System.out.println(SEPARATOR);
        donatLubang.printInfo();
        System.out.printf("%-15s: %.2f\n","Massa dalam kg", donatLubangMass.gramToKilogram());
        System.out.printf("%-15s: Rp%.2f\n","Biaya kirim", donatLubangShip.calculateCost());
        System.out.println(SEPARATOR);

        System.out.println("Donat tanpa lubang");
        System.out.println(SEPARATOR);
        System.out.printf("%-15s: ", "Isikan Radius");
        double radiusSphere = scan.nextDouble();

        Shape donatTanpaLubang = new Sphere(radiusSphere);
        MassConverter donatTanpaLubangMass = new Sphere(radiusSphere);
        ShippingCostCalculator donatTanpaLubangShip = new Sphere(radiusSphere);
        System.out.println(SEPARATOR);
        donatTanpaLubang.printInfo();
        System.out.printf("%-15s: %.2f\n","Massa dalam kg", donatTanpaLubangMass.gramToKilogram());
        System.out.printf("%-15s: Rp%.2f\n","Biaya kirim", donatTanpaLubangShip.calculateCost());
        System.out.println(SEPARATOR);
        scan.close();
    }
}
