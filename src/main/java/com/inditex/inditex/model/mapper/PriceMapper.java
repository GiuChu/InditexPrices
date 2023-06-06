package com.inditex.inditex.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.inditex.inditex.model.dto.PricesDTO;
import com.inditex.inditex.model.entity.PriceEntity;
import com.inditex.inditex.utils.Utils;

@Mapper(componentModel="spring", imports = Utils.class)
public interface PriceMapper {
	
	@Mapping(expression = "java(Utils.getformattedDate(source.getStartDate()))", target = "startDate")
	@Mapping(expression = "java(Utils.getformattedDate(source.getEndDate()))", target = "endDate")
	PricesDTO toDto(final PriceEntity source);
	
	List<PricesDTO> toDto(final List<PriceEntity> source);
}
