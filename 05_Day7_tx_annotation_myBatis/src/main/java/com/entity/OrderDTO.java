package com.entity;

/*
 *    create table t_order
   ( num number(4) primary key,
     pcode  varchar2(10) references product(pcode),
     quantity number(4) ); 
 */
public class OrderDTO {

	  int num;
	  String pcode;
	  int quantity;
	  

	@Override
	public String toString() {
		return "OrderDTO [num=" + num + ", pcode=" + pcode + ", quantity="
				+ quantity + "]";
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(int num, String pcode, int quantity) {
		super();
		this.num = num;
		this.pcode = pcode;
		this.quantity = quantity;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	  
	  
	  
	  
	  
}
