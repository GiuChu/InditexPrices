package com.inditex.inditex.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.inditex.model.dto.PricesDTO;
import com.inditex.inditex.model.entity.PriceEntity;
import com.inditex.inditex.model.mapper.PriceMapper;
import com.inditex.inditex.repository.PriceRepository;

@Service
public class PricesService {
	
	@Autowired 
	private PriceMapper mapper;
	
	@Autowired
    private PriceRepository priceRepository;
	
	public PricesDTO getPricesList(Long brandId, Long productId, Date date) {
		
		Optional<PriceEntity> price = priceRepository.findPriceElement(productId, brandId, date);
		
		return price.isPresent() ? mapper.toDto(price.get()) : null;
	}
}
