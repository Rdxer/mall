package com.macro.mall.service;

import com.macro.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品属性分类Service
 */
public interface PmsProductAttributeCategoryService {
    int create(String name);

    int update(Long id, String name);

    int delete(Long id);

    PmsProductAttributeCategory getItem(Long id);

    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);
}
