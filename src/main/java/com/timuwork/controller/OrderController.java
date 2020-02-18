package com.timuwork.controller;

import com.timuwork.controller.viewobject.OrderVO;
import com.timuwork.controller.viewobject.OrderWithNameVO;
import com.timuwork.dataobject.OrderDO;
import com.timuwork.dataobject.OrderWithNameDO;
import com.timuwork.dataobject.OrderWithStuStatusDO;
import com.timuwork.service.OrderService;
import com.timuwork.service.model.OrderModel;
import com.timuwork.util.MyUtility;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication(scanBasePackages = {"com.timuwork"})
@RestController
@MapperScan("com.timuwork.dao")

@Controller("order")
@RequestMapping("/order")
public class OrderController {

    @Autowired(required = false)
    private OrderService orderService;

    @RequestMapping("/neworder")
    @ResponseBody
    public int insertNewOrder(@RequestParam(name="sid") int id, @RequestParam(name="od") String orderdate,
                              @RequestParam(name="bk") int bk,@RequestParam(name="la") int la,
                              @RequestParam(name="lb") int lb,@RequestParam(name="lc") int lc,
                              @RequestParam(name="lco") int lco,@RequestParam(name="lsp") int lsp,
                              @RequestParam(name="lrice") int lrice,@RequestParam(name="sa") int sa,
                              @RequestParam(name="sb") int sb,@RequestParam(name="sc") int sc,
                              @RequestParam(name="sco") int sco,@RequestParam(name="ssp") int ssp,
                              @RequestParam(name="srice") int srice) {

        if(getOrder(id,orderdate) != null)
        {
            return 0;
        }
        OrderDO orderDO = new OrderDO();
        orderDO.setStudentid(id);
        orderDO.setOrderdate(MyUtility.changeStringToDate(orderdate));
        orderDO.setOrderbreakfast(bk);
        orderDO.setOrderla(la);
        orderDO.setOrderlb(lb);
        orderDO.setOrderlc(lc);
        orderDO.setOrderlcola(lco);
        orderDO.setOrderlrice(lrice);
        orderDO.setOrderlsp(lsp);
        orderDO.setOrdersa(sa);
        orderDO.setOrdersb(sb);
        orderDO.setOrdersc(sc);
        orderDO.setOrderscola(sco);
        orderDO.setOrderssp(ssp);
        orderDO.setOrdersrice(srice);

        return orderService.insertNewOrder(orderDO);
    }

    @RequestMapping("/getorder")
    @ResponseBody
    public OrderVO getOrder(@RequestParam(name="sid") int id, @RequestParam(name="od") String orderdate) {

        OrderDO orderDO1 = new OrderDO();
        orderDO1.setStudentid(id);
        orderDO1.setOrderdate(MyUtility.changeStringToDate(orderdate));

        OrderModel orderModel=orderService.getOrderBySIdAndDate(orderDO1);
        if(orderModel ==null){
            return null;
        }
        OrderVO orderVO= new OrderVO();
        BeanUtils.copyProperties(orderModel,orderVO);
        return orderVO;
    }

    @RequestMapping("/getstuallorder")
    @ResponseBody
    public List getOneStuAllOrder(@RequestParam(name="sid") int id) {
        List<OrderDO> orderDOList=orderService.getAllOrderById(id);
        return orderDOList;
    }

    @RequestMapping("/getdayorder")
    @ResponseBody
    public List getDayOrder( @RequestParam(name="od") String orderdate) {

        OrderDO orderDO2 = new OrderDO();
        orderDO2.setOrderdate(MyUtility.changeStringToDate(orderdate));

        List<OrderWithNameDO> orderWithNameDOList =orderService.getOrderByDate(orderDO2);
        return orderWithNameDOList;
    }

    @RequestMapping("/getds")
    @ResponseBody
    public List getDayStatus( @RequestParam(name="od") String orderdate) {

        OrderDO orderDO3 = new OrderDO();
        orderDO3.setOrderdate(MyUtility.changeStringToDate(orderdate));

        List<OrderWithStuStatusDO> orderWithStuStatusDOList =orderService.getTodayStuStatus(orderDO3);
        return orderWithStuStatusDOList;
    }

    @RequestMapping("/getalldetail")
    @ResponseBody
    public List getAllDetail() {

        List<OrderWithNameDO> orderWithNameDOList =orderService.getAllStuDetail();
        return orderWithNameDOList;
    }

}
