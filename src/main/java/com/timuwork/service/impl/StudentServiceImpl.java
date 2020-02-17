package com.timuwork.service.impl;

import com.timuwork.dao.StudentDOMapper;
import com.timuwork.dataobject.StudentDO;
import com.timuwork.service.StudentService;
import com.timuwork.service.model.StudentModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired(required = false)
    private StudentDOMapper studentDOMapper;

    @Override
    public StudentModel getStudentByNameAndRoom(StudentDO studentDO) {
        StudentDO studentDO1 = studentDOMapper.selectBySNameAndRoom(studentDO);
        if(studentDO1 == null){
            return null;
        }
        return convertFromDataObject(studentDO1);
    }

    @Override
    public StudentModel getStudentByIdAndPass(StudentDO studentDO) {
        StudentDO studentDO01 = studentDOMapper.selectBySIdAndPass(studentDO);
        if(studentDO01 == null){
            return null;

        }
        return convertFromDataObject(studentDO01);
    }

    @Override
    public StudentModel getStudentById(Integer id) {
        StudentDO studentDO = studentDOMapper.selectByPrimaryKey(id);
        if(studentDO == null){
            return null;

        }
        return convertFromDataObject(studentDO);
    }

    @Override
    public int changeStudentPassword(StudentDO studentDO) {
        int result= studentDOMapper.updatePasswordById(studentDO);
        return result;
    }

    public StudentModel convertFromDataObject(StudentDO studentDO){
        if(studentDO == null){
            return null;
        }
        StudentModel studentModel = new StudentModel();
        BeanUtils.copyProperties(studentDO,studentModel);
        return studentModel;
    }
}
