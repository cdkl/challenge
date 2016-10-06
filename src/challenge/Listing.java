package challenge;

public class Listing {
	private String title;
	private String manufacturer;
	private String currency;
	private String price;
	
	public Listing() {
	}
	
	@Override
	public String toString() {
		return title + " | " + manufacturer + " | " + currency + " | " + price;
	}
}
