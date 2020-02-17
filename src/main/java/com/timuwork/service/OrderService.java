package com.timuwork.service;

import com.timuwork.controller.viewobject.OrderWithNameVO;
import com.timuwork.dataobject.OrderDO;
import com.timuwork.dataobject.OrderWithNameDO;
import com.timuwork.dataobject.OrderWithStuStatusDO;
import com.timuwork.service.model.OrderModel;
import java.util.List;

public interface OrderService {
    int insertNewOrder(OrderDO orderDO);
    OrderModel getOrderBySIdAndDate(OrderDO orderDO);
    List<OrderDO> getAllOrderById(int id);
    List<OrderWithNameDO> getOrderByDate(OrderDO orderDO);
    List<OrderWithStuStatusDO> getTodayStuStatus(OrderDO orderDO);
}
