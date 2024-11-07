package com.msc.businessmanagement.api.mapper;


import com.msc.businessmanagement.api.dto.BusinessDto;
import com.msc.businessmanagement.model.Business;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class BusinessMapper {
    public abstract BusinessDto toDto(Business business);
}
