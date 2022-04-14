package com.service;

import java.util.List;

import com.dao.ProductDAO;
import com.entity.ProductDTO;

public class ProductService {

	ProductDAO dao;

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public List<ProductDTO> selectProduct() {
		return dao.selectProduct();
	}

}
