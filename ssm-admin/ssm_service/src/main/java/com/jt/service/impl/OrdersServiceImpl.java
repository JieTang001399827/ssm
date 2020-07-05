package com.jt.service.impl;

import com.github.pagehelper.PageHelper;
import com.jt.dao.IOrdersDao;
import com.jt.domain.Orders;
import com.jt.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAllOrders() throws Exception {
        return ordersDao.findAllOrders();
    }

    @Override
    public List<Orders> findAll(Integer pageNum, Integer pageSize) throws Exception {
        // 参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(pageNum, pageSize);
        return  ordersDao.findAll(pageNum, pageSize);
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return null;
    }
}
