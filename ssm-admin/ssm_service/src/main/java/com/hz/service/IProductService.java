package com.hz.service;

import com.hz.domain.Product;

import java.util.List;

/**
 * @author hz
 * @date 2020/4/3 19:30
 */


public interface IProductService {

    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;

    void deleteById(String id) throws Exception;

}
