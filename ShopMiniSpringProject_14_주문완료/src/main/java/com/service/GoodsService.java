package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;


@Service
public class GoodsService {

	@Autowired
	GoodsDAO dao;

	public List<GoodsDTO> goodsList(String gCategory) {
		return dao.goodsList(gCategory);
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		return dao.goodsRetrieve(gCode);
	}

	public int cartAdd(CartDTO cart) {
		return dao.cartAdd(cart);
	}

	public List<CartDTO> cartList(String userid) {
		return dao.cartList(userid);
	}

	public int cartUpdate(Map<String, String> map) {
		return dao.cartUpdate(map);
	}

	public int cartDelete(int num) {
		return dao.cartDelete(num);
	}

	public int delAllCart(ArrayList<String> list) {
		return dao.delAllCart(list);
	}

	public CartDTO orderConfirmByNum(int num) {
		System.out.println("서비스 진입");
		return dao.orderConfirmByNum(num);
	}
	
	@Transactional
	public int orderDone(OrderDTO oDTO, int orderNum) {
		System.out.println("서비스 진입");
		int n = dao.orderDone(oDTO);
		dao.cartDelete(orderNum);
		return n;
	}

	
}
