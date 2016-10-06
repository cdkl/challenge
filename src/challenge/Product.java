package challenge;

import com.google.gson.annotations.SerializedName;

public class Product {
	private String product_name;
	private String manufacturer;
	private String model;
	private String family;
	@SerializedName("announced-date")
	private String announced_date;
	
	public Product() {
	}
	
	@Override
	public String toString() {
		return product_name + " | " + manufacturer + " | " + model + " | " + family;
	}
}
