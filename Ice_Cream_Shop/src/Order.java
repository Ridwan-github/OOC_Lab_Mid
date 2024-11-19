import java.util.*;

public class Order {
    private Map<Flavours, Integer> scoops = new HashMap<>();
    private Map<Toppings, Integer> toppings = new HashMap<>();
    private boolean isWaffleCone;

    public void addScoop(Flavours flavor, int quantity) {
        scoops.put(flavor, scoops.getOrDefault(flavor, 0) + quantity);
    }

    public void addTopping(Toppings topping, int quantity) {
        toppings.put(topping, toppings.getOrDefault(topping, 0) + quantity);
    }

    public void setWaffleCone(boolean isWaffleCone) {
        this.isWaffleCone = isWaffleCone;
    }

    public Map<Flavours, Integer> getScoops() {
        return scoops;
    }

    public Map<Toppings, Integer> getToppings() {
        return toppings;
    }

    public double calculateSubtotal() {
        double total = 0;
        for (Map.Entry<Flavours, Integer> entry : scoops.entrySet()) {
            total += entry.getKey().getPrice_per_scoop() * entry.getValue();
        }
        for (Map.Entry<Toppings, Integer> entry : toppings.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        if (isWaffleCone) {
            total += 5.00;
        }
        return total;
    }

    public double calculateTax() {
        return calculateSubtotal() * 0.08;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }


}


