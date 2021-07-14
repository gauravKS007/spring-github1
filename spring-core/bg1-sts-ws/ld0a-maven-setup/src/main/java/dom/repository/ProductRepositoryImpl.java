package dom.repository;

import java.util.ArrayList;
import java.util.List;

import dom.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public List<Product> findAll() {
		// A stub for products
		List<Product> products = new ArrayList<>();
		products.add(new Product("P01", "Man's Searching for Meaning", 300));
		products.add(new Product("P02", "Awaken the gaints", 400));
		return products;
	}

}
