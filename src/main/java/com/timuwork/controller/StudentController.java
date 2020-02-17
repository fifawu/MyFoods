package com.timuwork.controller;

import com.timuwork.controller.viewobject.StudentVO;
import com.timuwork.dataobject.StudentDO;
import com.timuwork.service.StudentService;
import com.timuwork.service.model.StudentModel;
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

@Controller("stu")
@RequestMapping("/stu")
public class StudentController {

    @Autowired(required = false)
    private StudentService studentService;

    @RequestMapping("/login")
    @ResponseBody
    public StudentVO loginStudent(@RequestParam(name="sname") String stuname,@RequestParam(name="sroom") String sturoom,
                                @RequestParam(name="spass") String stupassword){
        StudentDO studentDO= new StudentDO();
        studentDO.setStudentName(stuname);
        studentDO.setStudentRoom(sturoom);
        studentDO.setStudentPassword(stupassword);
        StudentModel studentModel = studentService.getStudentByNameAndRoom(studentDO);

        if(studentModel == null){
            return null;
        }

        StudentVO studentVO =new StudentVO();
        BeanUtils.copyProperties(studentModel,studentVO);
        return studentVO;
    }

    @RequestMapping("/changepass")
    @ResponseBody
    public int changeStudentPassword(@RequestParam(name="sid") int id,@RequestParam(name="oldpass") String oldpassword,
                                @RequestParam(name="newpass") String newpassword){
        StudentDO studentDO02 = new StudentDO();
        studentDO02.setStudentId(id);
        studentDO02.setStudentPassword(oldpassword);
        if(studentService.getStudentByIdAndPass(studentDO02) == null){
            return 0;
        }
        else{
            StudentDO studentDO01= new StudentDO();
            studentDO01.setStudentId(id);
            studentDO01.setStudentPassword(newpassword);
            return studentService.changeStudentPassword(studentDO01);
        }

    }
}
