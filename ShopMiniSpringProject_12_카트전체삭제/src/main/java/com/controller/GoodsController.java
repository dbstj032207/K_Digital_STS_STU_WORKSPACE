package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;

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
	
	@RequestMapping("/loginCheck/cartList")
	public String cartList(RedirectAttributes attr, HttpSession session) {
		
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserid();
		
		List<CartDTO> list = service.cartList(userid);
		
		attr.addFlashAttribute("cartList", list);
		
		System.out.println(list);
		
		return "redirect:../cartList";
	}
	
	@RequestMapping("/loginCheck/cartUpdate")
	@ResponseBody
	public void cartUpdate(@RequestParam Map<String, String> map) {

		int n = service.cartUpdate(map);
		
		System.out.println("Update 개수: " + n);

	}
	
	
	
	@RequestMapping("/loginCheck/cartDelete")
	@ResponseBody
	public void cartDelete(@RequestParam("num") int num) {

		System.out.println("삭제할 주문번호" + num);
		
		int n = service.cartDelete(num);
		
		System.out.println("Delete 개수: " + n);

	}
	
	@RequestMapping("loginCheck/delAllCart")
	public String delAllCart(@RequestParam("check") ArrayList<String> list) {
		
		System.out.println("list: " + list);

		int n = service.delAllCart(list);
		
		System.out.println("Delete 개수: " + n);
		
		return "redirect:../loginCheck/cartList";
		
	}
	
}
