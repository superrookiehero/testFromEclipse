package com.yh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageInfo;
import com.yh.bean.Product;
@Repository
public interface ProductMapper {
	
	   
		public void addProduct(Product product);
		
		public List<Product> findAll();
		
		public Product findAllById(Integer id);
		public void upProductById(Product product);
		public void delProductById(Integer id);
        
		public List<Product> findAllByName(String productName);
	

}
