package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Product;

public interface ProductService
{
	public List<Product> findAll();
	public Product findProductById(Long id);
	public Product saveProduct(Product product);
	public void deleteProduct(Long id);
}
