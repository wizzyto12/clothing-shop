package task5.Items;

public class Hat extends ClothingItem {

	public Hat(String mSize, int mWeight, String mColor, String mColorPattern, double mPrice, String mFabric) {
		super(mSize, mWeight, mColor, mColorPattern, mPrice, mFabric);
	}

	@Override
	public double calculateContainerCost() {
		return 10;
	}
}
