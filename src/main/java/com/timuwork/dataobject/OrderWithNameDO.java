package com.timuwork.dataobject;

import java.util.Date;

public class OrderWithNameDO {
    private Integer orderid;
    private Integer studentid;
    private Date ordertime;
    private Date orderdate;
    private Integer orderbreakfast;
    private Integer orderla;
    private Integer orderlb;
    private Integer orderlc;
    private Integer orderlcola;
    private Integer orderlsp;

    public OrderWithNameDO(Integer orderid, Integer studentid, Date ordertime, Date orderdate, Integer orderbreakfast, Integer orderla, Integer orderlb, Integer orderlc, Integer orderlcola, Integer orderlsp, Integer orderlrice, Integer ordersa, Integer ordersb, Integer ordersc, Integer orderscola, Integer orderssp, Integer ordersrice, String studentName, String studentRoom, String roomPosition, String studentCollege) {
        this.orderid = orderid;
        this.studentid = studentid;
        this.ordertime = ordertime;
        this.orderdate = orderdate;
        this.orderbreakfast = orderbreakfast;
        this.orderla = orderla;
        this.orderlb = orderlb;
        this.orderlc = orderlc;
        this.orderlcola = orderlcola;
        this.orderlsp = orderlsp;
        this.orderlrice = orderlrice;
        this.ordersa = ordersa;
        this.ordersb = ordersb;
        this.ordersc = ordersc;
        this.orderscola = orderscola;
        this.orderssp = orderssp;
        this.ordersrice = ordersrice;
        this.studentName = studentName;
        this.studentRoom = studentRoom;
        this.roomPosition = roomPosition;
        this.studentCollege = studentCollege;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Integer getOrderbreakfast() {
        return orderbreakfast;
    }

    public void setOrderbreakfast(Integer orderbreakfast) {
        this.orderbreakfast = orderbreakfast;
    }

    public Integer getOrderla() {
        return orderla;
    }

    public void setOrderla(Integer orderla) {
        this.orderla = orderla;
    }

    public Integer getOrderlb() {
        return orderlb;
    }

    public void setOrderlb(Integer orderlb) {
        this.orderlb = orderlb;
    }

    public Integer getOrderlc() {
        return orderlc;
    }

    public void setOrderlc(Integer orderlc) {
        this.orderlc = orderlc;
    }

    public Integer getOrderlcola() {
        return orderlcola;
    }

    public void setOrderlcola(Integer orderlcola) {
        this.orderlcola = orderlcola;
    }

    public Integer getOrderlsp() {
        return orderlsp;
    }

    public void setOrderlsp(Integer orderlsp) {
        this.orderlsp = orderlsp;
    }

    public Integer getOrderlrice() {
        return orderlrice;
    }

    public void setOrderlrice(Integer orderlrice) {
        this.orderlrice = orderlrice;
    }

    public Integer getOrdersa() {
        return ordersa;
    }

    public void setOrdersa(Integer ordersa) {
        this.ordersa = ordersa;
    }

    public Integer getOrdersb() {
        return ordersb;
    }

    public void setOrdersb(Integer ordersb) {
        this.ordersb = ordersb;
    }

    public Integer getOrdersc() {
        return ordersc;
    }

    public void setOrdersc(Integer ordersc) {
        this.ordersc = ordersc;
    }

    public Integer getOrderscola() {
        return orderscola;
    }

    public void setOrderscola(Integer orderscola) {
        this.orderscola = orderscola;
    }

    public Integer getOrderssp() {
        return orderssp;
    }

    public void setOrderssp(Integer orderssp) {
        this.orderssp = orderssp;
    }

    public Integer getOrdersrice() {
        return ordersrice;
    }

    public void setOrdersrice(Integer ordersrice) {
        this.ordersrice = ordersrice;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRoom() {
        return studentRoom;
    }

    public void setStudentRoom(String studentRoom) {
        this.studentRoom = studentRoom;
    }

    public String getRoomPosition() {
        return roomPosition;
    }

    public void setRoomPosition(String roomPosition) {
        this.roomPosition = roomPosition;
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege;
    }

    private Integer orderlrice;
    private Integer ordersa;
    private Integer ordersb;
    private Integer ordersc;
    private Integer orderscola;
    private Integer orderssp;
    private Integer ordersrice;
    private String studentName;
    private String studentRoom;
    private String roomPosition;
    private String studentCollege;
}
