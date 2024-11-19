import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class InvoiceGenerator {
    public static void generate_invoice(Order order, String filename){
        try(FileWriter writer = new FileWriter(filename)){
            writer.write("Ice Cream Shop Invoice\n");
            for(Map.Entry<Flavours,Integer> entry: order.getScoops().entrySet()){
                writer.write(entry.getKey().getName() + " - " + entry.getValue() + " scoop(s): $" +
                        String.format("%.2f", entry.getKey().getPrice_per_scoop() * entry.getValue()) + "\n");
            }
            for (Map.Entry<Toppings, Integer> entry : order.getToppings().entrySet()) {
                writer.write(entry.getKey().getName() + " - " + entry.getValue() + " time(s): $" +
                        String.format("%.2f", entry.getKey().getPrice() * entry.getValue()) + "\n");
            }

            writer.write("Subtotal: $" + String.format("%.2f", order.calculateSubtotal()) + "\n");
            writer.write("Tax: $" + String.format("%.2f", order.calculateTax()) + "\n");
            writer.write("Total Amount Due: $" + String.format("%.2f", order.calculateTotal()) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
