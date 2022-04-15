package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

/*
 
   -- 상품테이블
  drop table t_order purge;
  drop table t_product  purge;

   create table t_product
   ( pcode  varchar2(10) primary key,
     pname varchar2(10),
     price number(4),
     quantity number(4) );
     
     
   -- 주문 테이블   
   create table t_order
   ( num number(4) primary key,
     pcode  varchar2(10) references t_product(pcode),
     quantity number(4) ); 
     
   create sequence t_order_seq;
    
   insert into t_product( pcode,pname,price,quantity) values ( 'p01','TV',1000, 10 );
   insert into t_product( pcode,pname,price,quantity) values ( 'p02','iPhone',500, 5 );
   insert into t_product( pcode,pname,price,quantity) values ( 'p03','G3',600, 20 );
    
   commit;

 
 */

public class ProductDAO {

	SqlSessionTemplate template;

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	
	
	
	
	//@Transactional //트렌젝션추가 
	public void addOrder(String pcode, int quantity) throws Exception{
		
		OrderDTO dto = new OrderDTO();
		dto.setPcode(pcode);
		
		dto.setQuantity(quantity);
            
        int n = template.insert("order.orderInsert", dto);     
        System.out.println("order table insert = "+n);
       // template.update("product.productUpdate",dto);//에러 발생 
        template.update("product.produc            ",dto);//에러 발생 코드
        
	}// end insert

    // 전체 상품 목록
	public List<ProductDTO> selectProduct() {

		return template.selectList("productList");

	}// end select

	 // 전체 주문 목록
	public List<OrderDTO> selectOrder() {

		return template.selectList("orderList");
	}// end select
	
	// 주문
		



}
