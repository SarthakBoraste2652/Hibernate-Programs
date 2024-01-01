package org.tnsif.jpaintro;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
//@Table(name="product")
public class Product implements Serializable{
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	@Lob
	private byte[] prodImg;
	private float rate;
	private int quantity;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Transient	
	private int x;
	
	
	public byte[] getProdImg() {
		return prodImg;
	}
	public void setProdImg(byte[] prodImg) {
		this.prodImg = prodImg;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", prodImg="
				+ Arrays.toString(prodImg) + ", rate=" + rate + ", quantity=" + quantity + ", date=" + date + ", x=" + x
				+ "]";
	}
	
	
	
		
}
