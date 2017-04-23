package task5.Items;

public class Tie extends ClothingItem {

	public Tie(String mSize, String mColor, String mColorPattern, double mPrice, String mFabric) {
		super(mSize, 0, mColor, mColorPattern, mPrice, mFabric);
	}

	@Override
	public String getType() {
		return "Tie";
	}
}
