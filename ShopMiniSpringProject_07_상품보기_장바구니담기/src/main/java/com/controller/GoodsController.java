package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;
import com.service.MemberService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService service;

	@RequestMapping("/goodsList")
	private ModelAndView goodsList(String gCategory) {
	
		if(gCategory == null) {
			gCategory = "top";
		}
		
		List<GoodsDTO> list = service.goodsList(gCategory);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping("/goodsRetrieve")
	@ModelAttribute("goodsRetrieve") // key값
	public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) {
		
		GoodsDTO dto = service.goodsRetrieve(gCode);
		
		return dto;
	}
	
	@RequestMapping("/loginCheck/cartAdd")
	public String cartAdd(CartDTO cart, HttpSession session) {
		
		MemberDTO mDTO = (MemberDTO)session.getAttribute("login");
		cart.setUserid(mDTO.getUserid());
		
		session.setAttribute("mesg", cart.getgCode());

		int n = service.cartAdd(cart);
		System.out.println("insert 개수: " + n);
			
		return "redirect:../goodsRetrieve?gCode=" + cart.getgCode();
	}
	
}
