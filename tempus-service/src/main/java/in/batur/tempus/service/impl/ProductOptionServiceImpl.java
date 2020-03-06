package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.ProductOption;
import in.batur.tempus.repository.ProductOptionRepository;
import in.batur.tempus.service.ProductOptionService;

@Service
public class ProductOptionServiceImpl implements ProductOptionService 
{
	Logger logger = LoggerFactory.getLogger(ProductOptionServiceImpl.class);

	@Autowired
    private ProductOptionRepository productOptionRepository;
	
	@Override
	public List<ProductOption> findAll() 
	{
		return (List<ProductOption>) productOptionRepository.findAll();
	}

	@Override
	public ProductOption findProductOptionById(Long id) 
	{
		Optional<ProductOption> productOption = productOptionRepository.findById(id);
		if (productOption.isPresent())
		{
			return productOption.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public ProductOption saveProductOption(ProductOption productOption) 
	{
		return productOptionRepository.save(productOption);
	}

	@Override
	public void deleteProductOption(Long id) 
	{
		productOptionRepository.deleteById(id);
	}
}
