package task5.Items;

public class Suit extends ClothingItem {

	public Suit(String mSize, int mWeight, String mColor, String mColorPattern, double mPrice, String mFabric) {
		super(mSize, mWeight, mColor, mColorPattern, mPrice, mFabric);
	}
	
	@Override
	public double calculateFinalPrice()
	{
		double price = mPrice;
		
		if ((mSize == "L" || mSize == "XL" || mSize == "XXL")) {
			price += price * 0.2;
		}
		return price;
	}
	
	@Override
	public double calculateContainerCost() {
		return 25;
	}
}
