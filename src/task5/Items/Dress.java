package task5.Items;

public class Dress extends ClothingItem {
	protected boolean mIsEvening;

	public Dress(boolean mIsEvening, String mSize, int mWeight, String mColor, String mColorPattern, double mPrice, String mFabric) {
		super(mSize, mWeight, mColor, mColorPattern, mPrice, mFabric);
		this.mIsEvening = mIsEvening;
	}
}