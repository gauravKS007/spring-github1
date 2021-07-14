package dom.repository;

import java.util.List;

import dom.model.Product;

// Write to Interface (Interface Driven Development)
public interface ProductRepository {
	public List<Product> findAll();
}
