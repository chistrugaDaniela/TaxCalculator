import taxCalculator.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.message);
        System.out.println("Total cost with tax is: " + taxCalculator.calculateTotal());
    }
}