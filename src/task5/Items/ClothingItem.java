package task5.Items;

public abstract class ClothingItem {
	protected String mSize;
	protected int mWeight;
	protected String mColor;
	protected String mColorPattern;
	protected double mPrice;
	protected String mFabric;

	public abstract String getType();

	public ClothingItem(String mSize, int mWeight, String mColor, String mColorPattern, double mPrice, String mFabric) {
		this.mSize = mSize;
		this.mWeight = mWeight;
		this.mColor = mColor;
		this.mColorPattern = mColorPattern;
		this.mPrice = mPrice;
		this.mFabric = mFabric;
	}

	public double calculateFinalPrice() {
		return mPrice;
	}

	public double calculateContainerCost() {
		return 0;
	}
	
	public int getWeight() {
		return mWeight;
	}
	
	public String getSize() {
		return mSize;
	}

	public String getColor() {
		return mColor;
	}

	public String getColorPattern() {
		return mColorPattern;
	}

	public double getPrice() {
		return mPrice;
	}

	public String getFabric() {
		return mFabric;
	}
}
