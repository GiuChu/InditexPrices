package com.inditex.inditex.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class PricesDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer productId;
	private Integer brandId;
	private Integer priceList;
	private String startDate;
	private String endDate;
	private BigDecimal price;
	
}
