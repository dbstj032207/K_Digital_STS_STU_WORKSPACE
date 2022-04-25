package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Repository
public class GoodsDAO implements GoodsDAO_Interface {
	@Autowired
	SqlSessionTemplate template;   //oracle 
	
	@Override
	public void orderDone(OrderDTO oDTO) throws Exception{
		int n = template.insert("CartMapper.orderDone", oDTO);
		
	}
	
	@Override
	public CartDTO orderConfirmByNum(int num) throws Exception{
		CartDTO dto = template.selectOne("CartMapper.cartByNum", num);
		return dto;
	}
	
	@Override
	public List<CartDTO> cartList(String userid)throws Exception{
		List<CartDTO> list = template.selectList("CartMapper.cartList", userid);
		return list;
	}
	@Override
	public List<GoodsDTO> goodsList(String gCategory) throws Exception{
		List<GoodsDTO> list= template.selectList("GoodsMapper.goodsList", gCategory);
		return list;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) throws Exception{
		GoodsDTO dto= template.selectOne("GoodsMapper.goodsRetrieve", gCode);
		return dto;
	}

	@Override
	public void cartAdd(CartDTO cart) throws Exception{
		template.insert("CartMapper.cartAdd", cart);		
	}
	@Override
	public void cartUpdate(Map<String, String> map)throws Exception {
		int n = template.update("CartMapper.cartUpdate", map);
		
	}
	@Override
	public void cartDelete(int num) throws Exception{
		int n= template.delete("CartMapper.cartDel", num);

		
	}
	@Override
	public void delAllCart(ArrayList<String> list)  throws Exception{
		int n = template.delete("CartMapper.cartAllDel", list);
		
	}




	
}
