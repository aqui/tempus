package in.batur.tempus.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.batur.tempus.entity.Product;
import in.batur.tempus.service.ProductService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController 
{
Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> findAll()
	{
		return productService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Product getProductById(@PathVariable Long id) 
	{
		Product product = productService.findProductById(id);
		if (product == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return product;
	}
	
	@PostMapping
	public Product saveProduct(@Valid @RequestBody Product product) 
	{
		return productService.saveProduct(product);
	}
	
	@PutMapping
	public void updateProduct(@Valid @RequestBody Product product) 
	{
		productService.saveProduct(product);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) 
	{
		productService.deleteProduct(id);
	}
}
