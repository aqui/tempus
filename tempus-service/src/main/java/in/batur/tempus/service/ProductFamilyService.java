package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.ProductFamily;

public interface ProductFamilyService
{
	public List<ProductFamily> findAll();
	public ProductFamily findProductFamilyById(Long id);
	public ProductFamily saveProductFamily(ProductFamily productFamily);
	public void deleteProductFamily(Long id);
}
