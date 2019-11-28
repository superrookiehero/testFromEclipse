package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yh.bean.Product;
import com.yh.mapper.ProductMapper;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper pm; 

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
        pm.addProduct(product);
	}

	/*@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pm.findAll();
	}*/

	@Override
	public Product findAllById(Integer id) {
		// TODO Auto-generated method stub
		return pm.findAllById(id);
	}

	@Override
	public void upProductById(Product product) {
		// TODO Auto-generated method stub
		pm.upProductById(product);
	}

	@Override
	public void delProductById(Integer id) {
		// TODO Auto-generated method stub
		pm.delProductById(id);
		
	}

	@Override
	public List<Product> findAllByName(String productName) {
		// TODO Auto-generated method stub
		return pm.findAllByName(productName);
	}

	@Override
	public PageInfo<Product> findAllByPage(Integer pageNum,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Product> list=pm.findAll();
		PageInfo<Product> pi=new PageInfo<>(list);
		return pi;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pm.findAll();
	}

	
	

}
