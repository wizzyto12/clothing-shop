package task5.Items;

public class ClothingItem {
	protected String mSize;
	protected int mWeight;
	protected String mColor;
	protected String mColorPattern;
	protected double mPrice;
	protected String mFabric;

	public ClothingItem(String mSize, int mWeight, String mColor, String mColorPattern, double mPrice, String mFabric) {
		this.mSize = mSize;
		this.mWeight = mWeight;
		this.mColor = mColor;
		this.mColorPattern = mColorPattern;
		this.mPrice = mPrice;
		this.mFabric = mFabric;
	}

	public int getWeight() {
		return mWeight;
	}

	public double calculateFinalPrice() {
		return mPrice;
	}
	
	public double calculateContainerCost() {
		return 0;
	}
}
