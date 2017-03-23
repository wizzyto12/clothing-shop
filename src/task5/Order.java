package task5;

import java.util.ArrayList;
import java.util.List;

import task5.Items.ClothingItem;
import task5.Items.Dress;
import task5.Items.Hat;
import task5.Items.Suit;

public class Order {
	public static final String BOX_TYPE_1 = "box_type_1";
	public static final String BOX_TYPE_2 = "box_type_2";
	public static final String BOX_TYPE_3 = "box_type_3";
	public static double BOX_TYPE_1_PRICE = 15;
	public static double BOX_TYPE_2_PRICE = 10;
	public static double BOX_TYPE_3_PRICE = 25;

	protected List<ClothingItem> mItems = new ArrayList<ClothingItem>();

	public Order(List<ClothingItem> mItems) {
		this.mItems = mItems;
	}
	
	public double calculatePrice()
	{
		double price = 0;
		
		for (ClothingItem clothingItem : mItems)
		{
			price += clothingItem.calculateFinalPrice();
		}
		
		return price;
	}
	
	public int calculateWeight()
	{
		int weight = 0;
		
		for (ClothingItem clothingItem : mItems)
		{
			weight += clothingItem.getWeight();
		}
		
		return weight;
	}
	
	public double calculateContainerCosts()
	{
		double containerCosts = 0;
		
		for (ClothingItem clothingItem : mItems)
		{
			if (clothingItem instanceof Dress) {
				containerCosts += BOX_TYPE_1_PRICE;
			}
			else if(clothingItem instanceof Hat) {
				containerCosts += BOX_TYPE_2_PRICE;
			}
			else if (clothingItem instanceof Suit) {
				containerCosts += BOX_TYPE_3_PRICE;
			}
		}
		
		return containerCosts;
	}
}
