package com.inditex.inditex.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.inditex.model.dto.PricesDTO;
import com.inditex.inditex.service.PricesService;

@RestController
@RequestMapping("/products")
public class PriceController {
	
	@Autowired
    private PricesService pricesService;

    @GetMapping("/price")
    public ResponseEntity<PricesDTO> getProductPrice(
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") Date date,
        @RequestParam("productId") Long productId,
        @RequestParam("brandId") Long brandId
    ) {
        PricesDTO price = pricesService.getPricesList(brandId, productId, date);

        if (price != null) {
            return ResponseEntity.ok(price);
        }

        return ResponseEntity.notFound().build();
    }
}
