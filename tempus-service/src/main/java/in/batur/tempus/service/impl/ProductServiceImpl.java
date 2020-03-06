package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Product;
import in.batur.tempus.repository.ProductRepository;
import in.batur.tempus.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService 
{
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
    private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() 
	{
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product findProductById(Long id) 
	{
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent())
		{
			return product.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Product saveProduct(Product product) 
	{
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) 
	{
		productRepository.deleteById(id);
	}
}
