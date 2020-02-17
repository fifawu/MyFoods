package com.timuwork.service;

import com.timuwork.dataobject.StudentDO;
import com.timuwork.service.model.StudentModel;

public interface StudentService {
    StudentModel getStudentByNameAndRoom(StudentDO studentDO);
    StudentModel getStudentByIdAndPass(StudentDO studentDO);
    StudentModel getStudentById(Integer id);
    int changeStudentPassword(StudentDO studentDO);
}
