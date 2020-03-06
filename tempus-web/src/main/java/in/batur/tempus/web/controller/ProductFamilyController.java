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

import in.batur.tempus.entity.ProductFamily;
import in.batur.tempus.service.ProductFamilyService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/productfamily")
public class ProductFamilyController 
{
Logger logger = LoggerFactory.getLogger(ProductFamilyController.class);
	
	@Autowired
	private ProductFamilyService productFamilyService;
	
	@GetMapping
	public List<ProductFamily> findAll()
	{
		return productFamilyService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public ProductFamily getProductFamilyById(@PathVariable Long id) 
	{
		ProductFamily productFamily = productFamilyService.findProductFamilyById(id);
		if (productFamily == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return productFamily;
	}
	
	@PostMapping
	public ProductFamily saveProductFamily(@Valid @RequestBody ProductFamily productFamily) 
	{
		return productFamilyService.saveProductFamily(productFamily);
	}
	
	@PutMapping
	public void updateProductFamily(@Valid @RequestBody ProductFamily productFamily) 
	{
		productFamilyService.saveProductFamily(productFamily);
	}

	@DeleteMapping("/{id}")
	public void deleteProductFamily(@PathVariable Long id) 
	{
		productFamilyService.deleteProductFamily(id);
	}
}
