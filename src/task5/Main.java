/**
 * We design an application for an Internet clothing shop. We have different types 
 * of clothing items, which have the following common properties:
- Size
- Weight
- Color
- Color pattern
- Price
- Fabric


There is a special processing for some of the items:
- The price for an evening dress is 50% more
- A suite has special 20% surcharge for sizes L, XL and XXL
- Pink socks cost 100% more
- The weight for socks and ties is assumed to be zero.

Create classes for the different clothing items.

Create a class for an order, containing clothing items. This class must calculate the price and the 
weight of the whole order as a sum of the price and weight of the individual items.

Hats, dresses and suits are put in separate boxes before shipping. There are 3 types of boxes. 
Dresses are put in boxes of type 1, hats - in boxes of type 2 and the suits go into boxes of type 3. 
Boxes of type 1 cost $15, boxes of type 2 - $10 and the bigger boxes for the suits, of type 3 cost $25.

We have to calculate the containers cost of an order, 
which is the sum of the boxes needed for the different items.

Create tables in the database for the clothing items, 
container prizes and orders. Develop a code in Java for creating classes using the data from the database.

 */
package task5;

import java.util.ArrayList;
import java.util.List;
import task5.Items.ClothingItem;
import task5.Items.Dress;
import task5.Items.Hat;
import task5.Items.Socks;
import task5.Items.Suit;
import task5.Items.Tie;

class Main {
	
	static List<ClothingItem> items = new ArrayList<ClothingItem>();

	public static void main(String[] args) {
		items.add(new Dress(true, "S", 10, "blue", "color pattern", 10, "fabric"));
		items.add(new Dress(false, "S", 10, "blue", "color pattern", 10, "fabric"));
		items.add(new Suit("S", 10, "blue", "color pattern", 10, "fabric"));
		items.add(new Suit("L", 10, "blue", "color pattern", 10, "fabric"));
		items.add(new Hat("L", 10, "blue", "color pattern", 10, "fabric"));
		items.add(new Tie("L", "blue", "color pattern", 10, "fabric"));
		items.add(new Socks("L", "blue", "color pattern", 10, "fabric"));
		items.add(new Socks("L", "pink", "color pattern", 10, "fabric"));
		
		Order order = new Order(items);

		System.out.println(String.format("Price: %.2f", order.calculatePrice()));
		System.out.println(String.format("Weight: %d", order.calculateWeight()));
		System.out.println(String.format("Container costs: %.2f", order.calculateContainerCosts()));
    }
}