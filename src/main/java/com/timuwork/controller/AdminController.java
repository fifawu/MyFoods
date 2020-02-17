package com.timuwork.controller;

import com.timuwork.controller.viewobject.AdminVO;
import com.timuwork.service.AdminServiece;
import com.timuwork.service.model.AdminModel;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.timuwork"})
@RestController
@MapperScan("com.timuwork.dao")

@Controller("admin")
@RequestMapping("/admin")
public class AdminController {

    @Autowired(required = false)
    private AdminServiece adminServiece;

    @RequestMapping("/get")
    @ResponseBody

    public AdminVO getAdminVO(@RequestParam(name="aname") String adminname){
        AdminModel adminModel = adminServiece.getAdminByName(adminname);
        if(adminModel == null){
            return  null;
        }
        AdminVO adminVO= new AdminVO();
        BeanUtils.copyProperties(adminModel,adminVO);
        return adminVO;
    }

}
