package com.jt.service;

import com.jt.domain.Product;

import java.util.List;


public interface IProductService {

    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;

    void deleteById(String id) throws Exception;

}
