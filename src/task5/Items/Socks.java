package task5.Items;

public class Socks extends ClothingItem {

	public Socks(String mSize, String mColor, String mColorPattern, double mPrice, String mFabric) {
		super(mSize, 0, mColor, mColorPattern, mPrice, mFabric);
	}

	@Override
	public double calculateFinalPrice() {
		double price = mPrice;

		if (mColor == "pink") {
			price += price;
		}

		return price;
	}

	@Override
	public String getType() {
		return "Socks";
	}

}
