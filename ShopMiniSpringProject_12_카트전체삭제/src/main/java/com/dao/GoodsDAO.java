package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;


@Repository
public class GoodsDAO {

	@Autowired
	SqlSessionTemplate template;	//자동주입

	public List<GoodsDTO> goodsList(String gCategory) {
		return template.selectList("GoodsMapper.goodslist", gCategory);
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		return template.selectOne("GoodsMapper.goodsRetrieve", gCode);
	}

	public int cartAdd(CartDTO cart) {
		return template.insert("CartMapper.cartAdd", cart);
	}

	public List<CartDTO> cartList(String userid) {
		return template.selectList("CartMapper.cartList", userid);
	}

	public int cartUpdate(Map<String, String> map) {
		return template.update("CartMapper.cartUpdate", map);
	}

	public int cartDelete(int num) {
		return template.delete("CartMapper.cartDel", num);
	}

	public int delAllCart(ArrayList<String> list) {
		return template.delete("CartMapper.cartAllDel", list);
	}

}
