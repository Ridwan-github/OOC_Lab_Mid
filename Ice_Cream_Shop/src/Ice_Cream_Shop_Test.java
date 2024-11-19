import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Ice_Cream_Shop_Test {

    @Test
    public void testAddScoopsAndSubtotal() {
        Order order = new Order();
        Flavours chocolateFudge = new Flavours ("Chocolate Fudge", 3.00);
        Flavours strawberrySwirl = new Flavours ("Strawberry Swirl", 2.75);

        order.addScoop(chocolateFudge, 2);
        order.addScoop(strawberrySwirl, 1);

        double expectedSubtotal = (3.00 * 2) + (2.75 * 1);
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.001);
    }

    @Test
    public void testAddToppingsAndSubtotal() {
        Order order = new Order();
        Toppings sprinkles = new Toppings ("Sprinkles", 0.30);
        Toppings chocolateChips = new Toppings ("Chocolate Chips", 0.50);

        order.addTopping(sprinkles, 3);
        order.addTopping(chocolateChips, 2);

        double expectedSubtotal = (0.30 * 3) + (0.50 * 2);
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.001);
    }

    @Test
    public void testEmptyOrderOrNoTopping (){
        Order order = new Order();
        order.setWaffleCone(false);

        double expectedSubtotal=0.00;
        double expectedTax=0.00;
        double expectedTotal=0.00;

        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.001);
        assertEquals(expectedTax,order.calculateTax(), 0.001);
        assertEquals(expectedTotal,order.calculateTotal(),0.001);
    }



}


