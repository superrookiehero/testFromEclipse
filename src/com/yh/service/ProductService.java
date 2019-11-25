package com.yh.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yh.bean.Product;

public interface ProductService {
	
	public PageInfo<Product> findAllByPage(Integer pageNum,Integer pageSize);
	
	public void addProduct(Product product);
	
	public List<Product> findAll();
	
	public Product findAllById(Integer id);
	
	public void upProductById(Product product);
	
	public void delProductById(Integer id);
	
	public List<Product> findAllByName(String productName);
}
