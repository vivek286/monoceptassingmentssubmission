package com.techlabs.ShopingCart;

import java.sql.Date;
import java.util.List;

public class Orders {
	private int orderid;
	private Date date;
	private List<LineItem> lineItems;
	public Orders(int orderid, Date date, List<LineItem> lineItems) {
		super();
		this.orderid = orderid;
		this.date = date;
		this.lineItems = lineItems;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", date=" + date + ", lineItems=" + lineItems + "]";
	}
	
	
	
}
