package com.example.exintermediate.form;

import org.springframework.lang.NonNull;

public class HotelForm {
    /** 価格 */
	private String price;

	/**
	 * 価格をintで返す.
	 * 
	 * @return intに変換した価格
	 */
	public Integer getIntPrice() {
		return Integer.parseInt(this.price);
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
  

