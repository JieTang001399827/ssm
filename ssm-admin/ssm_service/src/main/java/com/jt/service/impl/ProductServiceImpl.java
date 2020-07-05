package com.jt.service.impl;

import com.jt.dao.IProductDao;
import com.jt.domain.Product;
import com.jt.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception  {
        productDao.save(product);
    }

    @Override
    public void deleteById(String id) throws Exception {
        productDao.deleteById(id);
    }
}
