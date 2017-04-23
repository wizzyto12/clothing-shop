package task5.Items;

public class Dress extends ClothingItem {
	protected boolean mIsEvening;

	public Dress(boolean mIsEvening, String mSize, int mWeight, String mColor, String mColorPattern, double mPrice,
			String mFabric) {
		super(mSize, mWeight, mColor, mColorPattern, mPrice, mFabric);
		this.mIsEvening = mIsEvening;

	}

	@Override
	public double calculateFinalPrice() {
		double price = mPrice;

		if (this.mIsEvening) {
			price += price * 0.5;
		}
		return price;
	}

	@Override
	public double calculateContainerCost() {
		return 15;
	}

	@Override
	public String getType() {
		return "Dress";
	}

}
