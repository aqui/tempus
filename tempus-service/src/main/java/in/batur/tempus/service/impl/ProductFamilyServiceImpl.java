package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.ProductFamily;
import in.batur.tempus.repository.ProductFamilyRepository;
import in.batur.tempus.service.ProductFamilyService;

@Service
public class ProductFamilyServiceImpl implements ProductFamilyService 
{
	Logger logger = LoggerFactory.getLogger(ProductFamilyServiceImpl.class);

	@Autowired
    private ProductFamilyRepository productFamilyRepository;
	
	@Override
	public List<ProductFamily> findAll() 
	{
		return (List<ProductFamily>) productFamilyRepository.findAll();
	}

	@Override
	public ProductFamily findProductFamilyById(Long id) 
	{
		Optional<ProductFamily> productFamily = productFamilyRepository.findById(id);
		if (productFamily.isPresent())
		{
			return productFamily.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public ProductFamily saveProductFamily(ProductFamily productFamily) 
	{
		return productFamilyRepository.save(productFamily);
	}

	@Override
	public void deleteProductFamily(Long id) 
	{
		productFamilyRepository.deleteById(id);
	}
}
