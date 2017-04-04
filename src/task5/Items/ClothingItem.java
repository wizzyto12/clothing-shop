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
		double price = mPrice;

		if (this instanceof Dress && ((Dress) this).mIsEvening) {
			price += price * 0.5;
		} else if (this instanceof Suit && (mSize == "L" || mSize == "XL" || mSize == "XXL")) {
			price += price * 0.2;
		} else if (this instanceof Socks && mColor == "pink") {
			price += price;
		}

		return price;
	}
}
