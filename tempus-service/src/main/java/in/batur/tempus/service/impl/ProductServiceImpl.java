package in.batur.tempus.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import in.batur.tempus.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService 
{
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
}
