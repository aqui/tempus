package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.ProductOption;

public interface ProductOptionService
{
	public List<ProductOption> findAll();
	public ProductOption findProductOptionById(Long id);
	public ProductOption saveProductOption(ProductOption productOption);
	public void deleteProductOption(Long id);
}
