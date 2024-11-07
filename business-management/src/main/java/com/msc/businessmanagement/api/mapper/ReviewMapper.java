package com.msc.businessmanagement.api.mapper;


import com.msc.businessmanagement.api.dto.ReviewDto;
import com.msc.businessmanagement.model.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class ReviewMapper {


    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "id", source = "id")
    //@Mapping(target = "isVisible", source = "isVisible")
    @Mapping(target = "businessId", source = "businessId")
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "rating", source = "rating")
    @Mapping(target = "comment", source = "comment")
    @Mapping(target = "reviewDate", source = "reviewDate")
    public abstract ReviewDto entityToDto(Review review);

    public List<ReviewDto> entityListToDtoList(List<Review> reviews) {
        return reviews.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
