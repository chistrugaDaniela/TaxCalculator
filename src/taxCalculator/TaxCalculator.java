package taxCalculator;

public class TaxCalculator {
    public double price = 50.5;
    public double tax = 100.5;
    public int quantity = 100;
    public double total = 0;
    public String message = "I want to buy " + quantity + " shirt!";

    public double calculateTotal(){
        return total = price * quantity * tax;
    }
}
