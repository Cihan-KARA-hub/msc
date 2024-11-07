package com.msc.businessmanagement.api.dto;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;

import java.util.Collection;
import java.util.List;

public class PageModelResponseDto<T> extends PagedModel<PagedModel<T>> {

    private final Page<T> page;

    public PageModelResponseDto(List<T> content, long totalElements, Pageable pageable) {
        this.page = new PageImpl<>(content, pageable, totalElements);
    }

}