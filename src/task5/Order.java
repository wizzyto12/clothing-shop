package task5;

import java.util.ArrayList;
import java.util.List;

import task5.Items.ClothingItem;

public class Order {

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
			containerCosts += clothingItem.calculateContainerCost();
		}
		
		return containerCosts;
	}
}
