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

import in.batur.tempus.entity.ProductType;
import in.batur.tempus.service.ProductTypeService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/producttype")
public class ProductTypeController 
{
Logger logger = LoggerFactory.getLogger(ProductTypeController.class);
	
	@Autowired
	private ProductTypeService productTypeService;
	
	@GetMapping
	public List<ProductType> findAll()
	{
		return productTypeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public ProductType getProductTypeById(@PathVariable Long id) 
	{
		ProductType productType = productTypeService.findProductTypeById(id);
		if (productType == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return productType;
	}
	
	@PostMapping
	public ProductType saveProductType(@Valid @RequestBody ProductType productType) 
	{
		return productTypeService.saveProductType(productType);
	}
	
	@PutMapping
	public void updateProductType(@Valid @RequestBody ProductType productType) 
	{
		productTypeService.saveProductType(productType);
	}

	@DeleteMapping("/{id}")
	public void deleteProductType(@PathVariable Long id) 
	{
		productTypeService.deleteProductType(id);
	}
}
