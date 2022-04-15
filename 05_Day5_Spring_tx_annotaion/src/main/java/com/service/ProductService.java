package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

import oracle.net.aso.p;

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
	
	public List<OrderDTO> selectOrder() {
		return dao.selectOrder();
	}

	@Transactional	//tx처리함 필요함수 위에 붙여줌
	public void addOrder(String pcode, int quantity) throws Exception {
		dao.addOrder(pcode, quantity);
	}
	

}
