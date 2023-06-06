package com.inditex.inditex.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inditex.inditex.model.entity.PriceEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long>, JpaSpecificationExecutor<PriceEntity>  {
    
	@Query(value = "SELECT * FROM PRICES " +
            "WHERE " +
            "PRODUCT_ID = :productId AND " +
            "BRAND_ID = :brandId AND " +
            ":date between START_DATE and END_DATE " +
            "ORDER BY PRIORITY DESC " +
            "FETCH FIRST 1 ROWS ONLY", nativeQuery = true)
    Optional<PriceEntity> findPriceElement(@Param("productId") Long productId,
            @Param("brandId") Long brandId,
            @Param("date") Date date);
}