package com.timuwork.dataobject;

public class OrderWithStuStatusDO {
    private Integer orderid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    private String studentName;

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

    private String studentRoom;
    private String roomPosition;
    private String studentCollege;

    public OrderWithStuStatusDO(Integer orderid, String studentName, String studentRoom, String roomPosition, String studentCollege) {
        this.orderid = orderid;
        this.studentName = studentName;
        this.studentRoom = studentRoom;
        this.roomPosition = roomPosition;
        this.studentCollege = studentCollege;
    }
}
