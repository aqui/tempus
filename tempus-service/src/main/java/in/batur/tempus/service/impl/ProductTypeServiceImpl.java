package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.ProductType;
import in.batur.tempus.repository.ProductTypeRepository;
import in.batur.tempus.service.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService 
{
	Logger logger = LoggerFactory.getLogger(ProductTypeServiceImpl.class);

	@Autowired
    private ProductTypeRepository productTypeRepository;
	
	@Override
	public List<ProductType> findAll() 
	{
		return (List<ProductType>) productTypeRepository.findAll();
	}

	@Override
	public ProductType findProductTypeById(Long id) 
	{
		Optional<ProductType> productType = productTypeRepository.findById(id);
		if (productType.isPresent())
		{
			return productType.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public ProductType saveProductType(ProductType productType) 
	{
		return productTypeRepository.save(productType);
	}

	@Override
	public void deleteProductType(Long id) 
	{
		productTypeRepository.deleteById(id);
	}
}
