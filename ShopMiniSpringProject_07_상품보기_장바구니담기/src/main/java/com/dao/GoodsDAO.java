package com.dao;

import java.util.List;

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

}
