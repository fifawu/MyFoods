package com.timuwork.service.impl;

import com.timuwork.dao.AdminDOMapper;
import com.timuwork.dataobject.AdminDO;
import com.timuwork.service.AdminServiece;
import com.timuwork.service.model.AdminModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiecImpl implements AdminServiece {

    @Autowired(required = false)
    private AdminDOMapper adminDOMapper;
    @Override
    public AdminModel getAdminByName(String adminname) {
        AdminDO adminDO=adminDOMapper.selectAdminByName(adminname);
        if(adminDO == null)
            return null;
        return convertFromDataObject(adminDO);
    }

    public AdminModel convertFromDataObject(AdminDO adminDO){
        if(adminDO == null){
            return null;
        }
        AdminModel adminModel = new AdminModel();
        BeanUtils.copyProperties(adminDO,adminModel);
        return adminModel;
    }
}
