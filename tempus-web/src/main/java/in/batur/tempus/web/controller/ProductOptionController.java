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

import in.batur.tempus.entity.ProductOption;
import in.batur.tempus.service.ProductOptionService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/productoption")
public class ProductOptionController 
{
Logger logger = LoggerFactory.getLogger(ProductOptionController.class);
	
	@Autowired
	private ProductOptionService productOptionService;
	
	@GetMapping
	public List<ProductOption> findAll()
	{
		return productOptionService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public ProductOption getProductOptionById(@PathVariable Long id) 
	{
		ProductOption productOption = productOptionService.findProductOptionById(id);
		if (productOption == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return productOption;
	}
	
	@PostMapping
	public ProductOption saveProductOption(@Valid @RequestBody ProductOption productOption) 
	{
		return productOptionService.saveProductOption(productOption);
	}
	
	@PutMapping
	public void updateProductOption(@Valid @RequestBody ProductOption productOption) 
	{
		productOptionService.saveProductOption(productOption);
	}

	@DeleteMapping("/{id}")
	public void deleteProductOption(@PathVariable Long id) 
	{
		productOptionService.deleteProductOption(id);
	}
}
