package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.ProductType;

public interface ProductTypeService
{
	public List<ProductType> findAll();
	public ProductType findProductTypeById(Long id);
	public ProductType saveProductType(ProductType productType);
	public void deleteProductType(Long id);
}
