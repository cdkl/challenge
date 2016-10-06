package challenge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class Challenge {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException {
		if(args.length != 3) {
			throw new RuntimeException("Arguments required: <productfile> <listingsfile> <outputfile>");
		}
		
		Gson gson = new Gson();
		
		// feed the beast
		JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(args[0])));
		reader.setLenient(true);
		while(reader.peek() != JsonToken.END_DOCUMENT) {
			Product product = gson.fromJson(reader, Product.class);
			System.out.println(product.toString());
		}

		reader = new JsonReader(new InputStreamReader(new FileInputStream(args[1])));
		reader.setLenient(true);
		while(reader.peek() != JsonToken.END_DOCUMENT) {
			Listing listing = gson.fromJson(reader, Listing.class);
			System.out.println(listing.toString());
		}
	}

}
