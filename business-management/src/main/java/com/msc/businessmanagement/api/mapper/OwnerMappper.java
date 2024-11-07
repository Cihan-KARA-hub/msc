package com.msc.businessmanagement.api.mapper;


import com.msc.businessmanagement.api.dto.OwnerDto;
import com.msc.businessmanagement.model.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class OwnerMappper {

    public abstract Owner toDto(Owner owner);

    public abstract Owner toEntity(@MappingTarget Owner owner, OwnerDto ownerDto);
}
