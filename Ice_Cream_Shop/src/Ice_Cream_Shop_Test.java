import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Ice_Cream_Shop_Test {

        @Test
        public void testAddScoopsAndSubtotal() {
            Order order = new Order();
            Flavours chocolateFudge = new Flavours ("Chocolate Fudge", 3.00);
            Flavours strawberrySwirl = new Flavours ("Strawberry Swirl", 2.75);

            order.addScoop(chocolateFudge, 2); // 2 scoops of Chocolate Fudge
            order.addScoop(strawberrySwirl, 1); // 1 scoop of Strawberry Swirl

            double expectedSubtotal = (3.00 * 2) + (2.75 * 1);
            assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.001);
        }
}


