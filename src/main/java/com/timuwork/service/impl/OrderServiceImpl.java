package com.timuwork.service.impl;

import com.timuwork.controller.viewobject.OrderWithNameVO;
import com.timuwork.dao.OrderDOMapper;
import com.timuwork.dataobject.OrderDO;
import com.timuwork.dataobject.OrderWithNameDO;
import com.timuwork.dataobject.OrderWithStuStatusDO;
import com.timuwork.service.OrderService;
import com.timuwork.service.model.OrderModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private OrderDOMapper orderDOMapper;

    @Override
    public int insertNewOrder(OrderDO orderDO) {
        int result = orderDOMapper.insertNewOrder(orderDO);
        return result;
    }

    @Override
    public OrderModel getOrderBySIdAndDate(OrderDO orderDO) {
        OrderDO orderDO1=orderDOMapper.selectBySIdAndDate(orderDO);
        if(orderDO1 == null){
            return null;
        }
        return convertFromDataObject(orderDO1);
    }

    @Override
    public List<OrderDO> getAllOrderById(int id) {
        return orderDOMapper.selectByStuId(id);
    }

    @Override
    public List<OrderWithNameDO> getOrderByDate(OrderDO orderDO) {
        return orderDOMapper.selectByDate(orderDO);
    }

    @Override
    public List<OrderWithStuStatusDO> getTodayStuStatus(OrderDO orderDO) {
        return orderDOMapper.selectStudentStatusByDate(orderDO);
    }

    public OrderModel convertFromDataObject(OrderDO orderDO){
        if(orderDO == null){
            return null;
        }
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(orderDO,orderModel);
        return orderModel;
    }
}
