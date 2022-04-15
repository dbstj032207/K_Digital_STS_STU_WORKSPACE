package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {

	ProductDAO dao;

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	
	//占쏙옙瞿占쏙옙占�
	public List<ProductDTO> selectProduct(){
		return dao.selectProduct();
	}
	
	public List<OrderDTO> selectOrder() {
		return dao.selectOrder();
	}
	//특占쏙옙 占쏙옙占쌘듸옙 

	@Transactional
	public void addOrder(String pcode, int quantity) throws Exception{
		dao.addOrder(pcode, quantity);
	}

}
